package ru.feryafox.Task1.CountMap;

import java.util.Map;

public interface CountMap<T> {
    void add(T element);

    int getCount(T element);

    int remove(T element);

    int size();

    void addAll(CountMap<T> source);

    Map<T, Integer> toMap();

    void toMap(Map<T, Integer> destination);
}