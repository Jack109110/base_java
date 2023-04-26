package com.lazarev.other;

import java.util.ArrayList;
import java.util.List;

/**
 * Задачи из собеседований, показывающие пример работы с коллекциями
 */
public class TasksFromInterview {

    /**
     * Убрать дубликаты из коллекции (3 варианта)
     */
    public static void noDuplicate(List<String> e) {
        //  (1)  List<String> d = e.stream().distinct().toList();


        //  (2)  Set<String> n = new HashSet<>(e);
        //       System.out.println(n);

        //  (3)
        ArrayList<String> g = new ArrayList<>();
        for (String temp : e) {
            if (g.size() == 0) {
                g.add(temp);
                continue;
            }
            if (!g.contains(temp)) {
                g.add(temp);
            }
        }
        System.out.println(g);
    }

    /**
     * Найти максимальное значение в коллекции
     */
    public static void maxValue(List<Integer> e) {
        int max = e.get(0);
        for (Integer integer : e) {
            if (max < integer) {
                max = integer;
            }
        }
        System.out.println(max);
    }

    /**
     * Проверить слово на полиндромность
     */
    public static boolean polindrom(String p) {
        for (int i = 0; i <= p.length() - 1; i++) {
            if (p.charAt(i) != p.charAt(p.length() - 1 - i)) return false;
        }
        return true;
    }
}