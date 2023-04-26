package com.lazarev.cat;

public class Application {

    public static void main(String[] args) {

        Kotik tad = new Kotik("taddy", 1.2f, 1);

        Kotik lucky = new Kotik();
        lucky.setName("lucky");
        lucky.setAge(1.6f);
        lucky.setMeow(1);

        System.out.println("Котик " + tad.getName());
        tad.liveAnotherDay();

        System.out.println(tad.getMeow() == lucky.getMeow());
        System.out.println(Kotik.getKotCount());
    }
}