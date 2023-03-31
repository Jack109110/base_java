package com.lazarev.collections;

import java.util.*;

public class CollectionExamples {

    static String[] arrayExample = {"Germany", "Great Britain", "Russia", "Germany", "Great Britain", "Russia"};
    static List<String> listExample = new ArrayList<>();
    static Set<String> setExample = new HashSet<>();
    static Map<String, String> mapExample = new HashMap<>();

    public static void main(String[] args) {

        listExample.add("Moscow");
        listExample.add("London");
        listExample.add("Berlin");

        Collections.sort(listExample);

        setExample.add("red");
        setExample.add("black");
        setExample.add("grey");

        mapExample.put(arrayExample[0], listExample.get(0));
        mapExample.put(arrayExample[1], listExample.get(1));
        mapExample.put(arrayExample[2], listExample.get(2));

        listExample.add("Berlin");
        Set<String> linkedSetExample = new LinkedHashSet<>(listExample);
        Set<String> treeSetExample = new TreeSet<>(List.of(arrayExample));

        System.out.println(setExample.contains("black"));
        System.out.println(setExample.spliterator());

        System.out.println(listExample);
        System.out.println(setExample);
        System.out.println(mapExample);
        System.out.println(linkedSetExample);
        System.out.println(treeSetExample);
        System.out.println(treeSetExample);
    }

    /**
     * Задачи из собеседований, показывающие пример работы с коллекциями
     */
    public static class ExampleCollection {

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
}