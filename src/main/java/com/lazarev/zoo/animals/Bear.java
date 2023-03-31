package com.lazarev.zoo.animals;

import com.lazarev.zoo.animals.behavior.Run;
import com.lazarev.zoo.animals.behavior.Voice;
import com.lazarev.zoo.enums.CageSize;

public class Bear extends Carnivorous implements Run, Voice {

    {
        dimeshionCage = CageSize.MAX;
    }

    public Bear(String name, float age, int satiety) {
        super(name, age, satiety);
    }

    @Override
    public String voicing() {
        return "Медведь рычит";
    }

    @Override
    public void running() {
        System.out.println("Медведь умеет бегать");
    }

}