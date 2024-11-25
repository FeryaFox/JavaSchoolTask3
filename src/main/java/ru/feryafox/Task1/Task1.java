package ru.feryafox.Task1;

import ru.feryafox.Task1.CountMap.CountMap;
import ru.feryafox.Task1.CountMap.CountMapImpl;

public class Task1 {
    public static void main(String[] args) {
        CountMap<Integer> map = new CountMapImpl<>();

        map.add(10);
        map.add(10);
        map.add(5);
        map.add(6);
        map.add(5);
        map.add(10);

        System.out.println(map.getCount(5)); // 2
        System.out.println(map.getCount(6)); // 1
        System.out.println(map.getCount(10)); // 3
    }

}
