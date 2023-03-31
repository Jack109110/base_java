package com.lazarev.zoo.animals;


import com.lazarev.zoo.enums.CageSize;
import com.lazarev.zoo.food.Food;

import java.util.Objects;

public abstract class Animals {

    public String name;
    public float age;
    public int satiety;
    public CageSize dimeshionCage;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return Float.compare(animals.age, age) == 0 && satiety == animals.satiety && Objects.equals(name, animals.name)
                && dimeshionCage == animals.dimeshionCage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, satiety, dimeshionCage);
    }

    public Animals() {
    }

    public Animals(String name, float age, int satiety) {
        this.name = name;
        this.age = age;
        this.satiety = satiety;
    }

    public abstract String eat(Food food);
}