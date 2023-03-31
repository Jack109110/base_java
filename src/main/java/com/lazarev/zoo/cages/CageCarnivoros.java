package com.lazarev.zoo.cages;

import com.lazarev.zoo.enums.CageSize;
import com.lazarev.zoo.exceptions.WrongAnimalException;
import com.lazarev.zoo.exceptions.WrongCageException;
import com.lazarev.zoo.animals.Animals;
import com.lazarev.zoo.animals.Carnivorous;

public class CageCarnivoros extends Cage {

    public CageCarnivoros(Object quantity, CageSize dimenshion) {
        super(quantity, dimenshion);
    }

    public void addAnimals(Animals animal, Animals link) {
        if (animal instanceof Carnivorous) {
            try {
                if (animal.dimeshionCage.equals(dimenshion)) {
                    getListAnimals().put(animal.name, link);
                } else {
                    throw new WrongCageException("Ошибка. Неподходящий размер вольера для животного");
                }
            } catch (WrongCageException ex) {
                ex.printStackTrace();
            }
        } else {
            try {
                throw new WrongAnimalException("Ошибка. Травоядное животное нельзя поместить в данный вольер");
            } catch (WrongAnimalException e) {
                e.printStackTrace();
            }
        }
    }
}