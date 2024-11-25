package ru.feryafox.Task2;

import java.util.*;

public class CollectionUtils {

    // Добавляет все элементы из source в destination
    public static <T> void addAll(List<? extends T> source, List<? super T> destination) {
        for (T item : source) {
            destination.add(item);
        }
    }

    // Создает новый ArrayList
    public static <T> List<T> newArrayList() {
        return new ArrayList<>();
    }

    // Возвращает индекс первого вхождения объекта o в списке source, или -1 если не найдено
    public static <T> int indexOf(List<? extends T> source, Object o) {
        for (int i = 0; i < source.size(); i++) {
            if (Objects.equals(source.get(i), o)) {
                return i;
            }
        }
        return -1;
    }

    // Возвращает новый список, содержащий не более size элементов из source
    public static <T> List<T> limit(List<? extends T> source, int size) {
        List<T> result = new ArrayList<>();
        for (int i = 0; i < Math.min(size, source.size()); i++) {
            result.add(source.get(i));
        }
        return result;
    }

    // Добавляет объект o в список source
    public static <T> void add(List<? super T> source, T o) {
        source.add(o);
    }

    // Удаляет из списка removeFrom все элементы, которые есть в c2
    public static <T> void removeAll(List<? super T> removeFrom, List<? extends T> c2) {
        for (T item : c2) {
            removeFrom.remove(item);
        }
    }

    // true если первый лист содержит все элементы второго
    public static <T> boolean containsAll(List<? extends T> c1, List<? extends T> c2) {
        for (T item : c2) {
            if (!c1.contains(item)) {
                return false;
            }
        }
        return true;
    }

    // true если первый лист содержит хотя бы 1 элемент второго
    public static <T> boolean containsAny(List<? extends T> c1, List<? extends T> c2) {
        for (T item : c2) {
            if (c1.contains(item)) {
                return true;
            }
        }
        return false;
    }

    // Возвращает лист, содержащий элементы из входного листа в диапазоне от min до max.
    // Элементы сравнивать через Comparable.
    // Прмер range(Arrays.asList(8,1,3,5,6, 4), 3, 6) вернет {3,4,5,6}
    public static <T extends Comparable<? super T>> List<T> range(List<? extends T> list, T min, T max) {
        List<T> result = new ArrayList<>();
        for (T item : list) {
            if (item.compareTo(min) >= 0 && item.compareTo(max) <= 0) {
                result.add(item);
            }
        }
        return result;
    }

    // Возвращает лист, содержащий элементы из входного листа в диапазоне от min до max.
    // Элементы сравнивать через Comparable.
    // Прмер range(Arrays.asList(8,1,3,5,6, 4), 3, 6) вернет {3,4,5,6}
    public static <T> List<T> range(List<? extends T> list, T min, T max, Comparator<? super T> comparator) {
        List<T> result = new ArrayList<>();
        for (T item : list) {
            if (comparator.compare(item, min) >= 0 && comparator.compare(item, max) <= 0) {
                result.add(item);
            }
        }
        return result;
    }
}
