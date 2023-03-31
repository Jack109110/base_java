package com.lazarev.zoo.animals;

import com.lazarev.zoo.animals.behavior.Voice;
import com.lazarev.zoo.animals.behavior.Run;
import com.lazarev.zoo.animals.behavior.Swim;
import com.lazarev.zoo.enums.CageSize;

public class Tiger extends Carnivorous implements Run, Swim, Voice {

    {
        dimeshionCage = CageSize.MAX;
    }

    public Tiger(String name, float age, int satiety) {
        super(name, age, satiety);
    }

    @Override
    public String voicing() {
        return "Тигр рычит";
    }

    @Override
    public void swimming() {
        System.out.println("Тигр плавает");
    }

    @Override
    public void running() {
        System.out.println("Тигр умеет бегать");
    }

}