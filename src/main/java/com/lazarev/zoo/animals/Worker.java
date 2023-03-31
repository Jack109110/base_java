package com.lazarev.zoo.animals;

import com.lazarev.zoo.animals.behavior.Voice;
import com.lazarev.zoo.food.Food;

public class Worker {

    public String name;
    public String department;

    public Worker() {
    }

    public Worker(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public void feed(Animals animals, Food food) {
        System.out.println(animals.name + ": " + animals.eat(food));
    }

    public void getVoice(Voice animals) {
        System.out.println(animals.voicing());
    }
}