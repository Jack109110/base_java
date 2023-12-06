package com.lazarev.other;

import java.util.ArrayList;
import java.util.List;

/**
 * Задачи из собеседований, показывающие пример работы с коллекциями, циклами, дженериками и тд.
 */
public class TasksFromInterview {

    /**
     * 1. Убрать дубликаты из коллекции (3 варианта решения)
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
     * 2. Найти максимальное значение в коллекции
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
     * 3. Проверить слово на полиндромность (2 варианта решения)
     */
    public static boolean polindrom(String p) {
        // (1)
        for (int i = 0; i <= p.length() - 1; i++) {
            if (p.charAt(i) != p.charAt(p.length() - 1 - i)) return false;
        }
        return true;

        // (2)
        //    String c = p.toLowerCase();
        //    StringBuilder d = new StringBuilder();
        //    d.append(c).reverse();
        //    return c.equals(d.toString());
    }

    /**
     * 4. При заданном диапазоне чисел вывести те, которые делятся на 5 или 3 без остатка, закончить перебор
     * диапазона на числе, которое делятся и на 5, и на 3; использовать дженерики
     */
    public static <T> T rangeInt(Integer j, Integer o) {
        for (Integer i = j; i <= o; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Выход из цикла на цифре " + i);
                return (T) i;
            } else if (i % 3 == 0) {
                System.out.println("Число " + i + " делится на 3 без остатка");
            } else if (i % 5 == 0) {
                System.out.println("Число " + i + " делится на 5 без остатка");
            } else {
                System.out.println("Ошибка, число " + i + " не делится на 3 или 5 без остатка");
            }
        }
        System.out.println("Введены неверные значения");
        return (T) "null";
    }

    /**
     * 5. Перевернуть строку (2 варианта)
     */
    public static void reverseString(String y) {
        // (1)
        ArrayList<String> w = new ArrayList<>();
        for (int i = 0; i < y.length(); i++) {
            w.add(String.valueOf(y.charAt(y.length() - 1 - i)));
        }
        String q = String.join("", w);
        System.out.println(q);

        // (2)
        //    StringBuilder m = new StringBuilder();
        //    m.append(y).reverse();
        //    System.out.println(m);
    }

    /**
     * 6. На вход приходят строка и символ. Посчитать, сколько раз данный символ встречается в строке
     */
    public static int counterChar(String t, Character p) {
        int counter = 0;
        for (int i = 0; i < t.length(); i++) {
            if (p == t.charAt(i)) counter++;
        }
        return counter;
    }

    /**
     * 7. Разделить строку на подстроки с помощью символа
     */
    public static void delimString(String g) {
        String[] m = g.split(",");
        for (String word : m) {
            System.out.println(word);
        }
    }

    /**
     * 8. Поменять местами a & b, не используя третью переменную.
     * (на вход методу приходит например 5 и 8, вернуть или вывести в консоль нужно 8 и 5.
     */
    public static void replaceVar(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }

    public static void replaceVar(String a, String b) {
        a = a + b;
        b = a.substring(0, (a.length() - b.length()));
        a = a.substring(b.length());
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    /**
     * 9. Написать метод, который будет возвращать true если поданный на вход массив int
     * содержит 3 и более последовательных числа в любом месте
     */
    public static boolean consecutiveNumb(int[] b) {
        for (int i = 0; i < b.length - 2; i++) {
            if (b[i] + 1 == b[i + 1] && b[i] + 2 == b[i + 2]) return true;
        }
        return false;
    }

    public static boolean consecNumb(int[] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                if (t[i] == t[j] + 1) {
                    for (int k = 0; k < t.length; k++) {
                        if (t[j] == t[k] + 1) return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * 10. Вернуть лист стрингов, в котором слова начинаются на букву "I"
     */
    public static ArrayList<String> listStr(ArrayList<String> h) {
        ArrayList<String> n = new ArrayList<>();
        char z = 'I';
        for (int i = 0; i < h.size(); i++) {
            if (h.get(i).charAt(0) == z) n.add(h.get(i));
        }
        return n;
    }

    /**
     * 11.Написать метод, который принимает на вход два массива А и Б, на выходе массив С
     * Массив С заполняется следующим образом, его i-ый элемент равен количеству элементов массива А
     * которые меньше либо равны i-тому элементу массива Б
     */
    public static int[] returnArray(int[] a, int[] b) {
        int[] c = new int[b.length];
        for (int i = 0; i < b.length; i++) {
            int counter = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] <= b[i]) counter++;
            }
            c[i] = counter;
        }
        return c;
    }

    /**
     * 12. Написать метод, на вход которого подается число, и возвращается сумма цифр данного числа
     * 99 -> 18
     */
    public static int sumInt(int l) {
        char[] m = ("" + l).toCharArray();
        int resultSum = 0;
        for (int i = 0; i < m.length; i++) {
            resultSum += Integer.parseInt(String.valueOf(m[i]));
        }
        return resultSum;
    }

    /**
     * 13. Написать метод на вычисление серии чисел фибоначчи
     */
    public static void fibonacci(int quantity) {
        int a =0, b =0, c=1;
        for (int i = 0; i <= quantity; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.println(a);
        }
    }

    /**
     * 14. Найти второе максимальное число в списке чисел
     */
    public static void secondBiggest(List<Integer> e) {
        int biggest = e.get(0);
        int secondBig = e.get(0);
        for (int i = 0; i < e.size(); i++) {
            if (e.get(i) > biggest) {
                secondBig = biggest;
                biggest = e.get(i);
            } else if (e.get(i) > secondBig && e.get(i) != biggest ) {
                secondBig = e.get(i);
            }
        }
        System.out.println(secondBig);
    }

}