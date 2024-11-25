package ru.feryafox.Task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> source = Arrays.asList(8, 1, 3, 5, 6, 4);
        List<Integer> destination = CollectionUtils.newArrayList();

        CollectionUtils.addAll(source, destination);
        System.out.println("После добавления всех элементов: " + destination);

        int index = CollectionUtils.indexOf(source, 3);
        System.out.println("Индекс числа 3: " + index);

        List<Integer> limited = CollectionUtils.limit(source, 3);
        System.out.println("Ограниченный список: " + limited);

        CollectionUtils.add(destination, 10);
        System.out.println("После добавления элемента: " + destination);

        CollectionUtils.removeAll(destination, Arrays.asList(1, 10));
        System.out.println("После удаления элементов: " + destination);

        boolean containsAll = CollectionUtils.containsAll(source, Arrays.asList(3, 5));
        System.out.println("Содержит все элементы (3, 5): " + containsAll);

        boolean containsAny = CollectionUtils.containsAny(source, Arrays.asList(7, 5));
        System.out.println("Содержит хотя бы один из элементов (7, 5): " + containsAny);

        List<Integer> ranged = CollectionUtils.range(source, 3, 6);
        System.out.println("Диапазон (3, 6): " + ranged);

        List<Integer> rangedWithComparator = CollectionUtils.range(source, 3, 6, Comparator.naturalOrder());
        System.out.println("Диапазон с компаратором (3, 6): " + rangedWithComparator);
    }

}
