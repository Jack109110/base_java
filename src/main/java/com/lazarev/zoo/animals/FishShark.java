package com.lazarev.zoo.animals;

import com.lazarev.zoo.animals.behavior.Swim;
import com.lazarev.zoo.enums.CageSize;

public class FishShark extends Carnivorous implements Swim {

    {
        dimeshionCage = CageSize.MIDDLE;
    }

    public FishShark(String name, float age, int satiety) {
        super(name, age, satiety);
    }

    @Override
    public void swimming() {
        System.out.println("Акула плавает");
    }

}