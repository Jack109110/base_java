package com.lazarev.cat;

public class Kotik {

    //поля класса
    private String name;
    private float age;
    private int meow;
    private static int kotCount = 0;
    private int satiety = 1;

    //конструкторы
    public Kotik() {
        kotCount++;
    }

    public Kotik(String name, float age, int meow) {
        this.name = name;
        this.age = age;
        this.meow = meow;
        kotCount++;
    }

    //методы
    public void play() {
        if (this.satiety <= 0) {
            System.out.print("Котик отказывется играть.");
            hungry();
        } else {
            System.out.println("Котик поиграл");
            satiety -= 1;
        }
    }

    public void climb() {
        if (this.satiety <= 0) {
            System.out.print("Котик отказывется лазать по мебели.");
            hungry();
        } else {
            System.out.println("Котик лазал по мебели");
            satiety -= 1;
        }
    }

    public void sleep() {
        if (this.satiety <= 0) {
            System.out.print("Котик отказывется спать.");
            hungry();
        } else {
            System.out.println("Котик поспал");
            satiety -= 1;
        }
    }

    public void chaseMouse() {
        if (this.satiety <= 0) {
            System.out.print("Котик отказывется ловить мышь.");
            hungry();
        } else {
            System.out.println("Котик поохотился на мышь");
            satiety -= 1;
        }
    }

    public void walking() {
        if (this.satiety <= 0) {
            System.out.print("Котик отказывется гулять.");
            hungry();
        } else {
            System.out.println("Котик погулял");
            satiety -= 1;
        }
    }

    //перегрузка метода eat
    public void eat(int quantitySatiety) {
        this.satiety += quantitySatiety;
        System.out.println("Котик поел");
    }

    public void eat(int quantitySatiety, String food) {
        this.satiety += quantitySatiety;
        System.out.println("Котик поел " + food);

    }

    public void eat() {
        eat(3, "лазанья");
    }

    public void hungry() {
        System.out.print(" \"Котик голоден!!! Покормите.\" ");
        eat();
    }

    public void liveAnotherDay() {
        for (int i = 1; i < 25; i++) {
            var randNumber = (int) (Math.random() * 5) + 1;
            switch (randNumber) {
                case 1:
                    System.out.print(i + " час ");
                    play();
                    break;

                case 2:
                    System.out.print(i + " час ");
                    sleep();
                    break;

                case 3:
                    System.out.print(i + " час ");
                    walking();
                    break;

                case 4:
                    System.out.print(i + " час ");
                    chaseMouse();
                    break;

                case 5:
                    System.out.print(i + " час ");
                    climb();
                    break;
            }
        }
    }

    //геттеры и сеттеры

    public static int getKotCount() {
        return kotCount;
    }

    public static void setKotCount(int kotCount) {
        Kotik.kotCount = kotCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public int getMeow() {
        return meow;
    }

    public void setMeow(int meow) {
        this.meow = meow;
    }
}