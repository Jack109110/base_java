package cages;

import animals.Animals;
import animals.Carnivorous;
import animals.Herbivore;
import enums.CageSize;
import exceptions.WrongAnimalException;
import exceptions.WrongCageException;

public class CageCarnivoros extends Cage{


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
            } catch (WrongCageException ex) {ex.printStackTrace();} }
        else { try {
            throw new WrongAnimalException("Ошибка. Травоядное животное нельзя поместить в данный вольер");
        } catch (WrongAnimalException e) { e.printStackTrace();

        }
        }

    }

}
