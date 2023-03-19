package cages;

import animals.Animals;
import animals.Herbivore;
import enums.CageSize;
import exceptions.WrongAnimalException;
import exceptions.WrongCageException;

public class CageHerbivore extends Cage {


    public CageHerbivore(Object quantity, CageSize dimenshion) {
        super(quantity, dimenshion);
    }


    public void addAnimals(Animals animal, Animals link) {
            if (animal instanceof Herbivore) {
                try {
                    if (animal.dimeshionCage.equals(dimenshion)) {
                        getListAnimals().put(animal.name, link);
                    } else {
                        throw new WrongCageException("Ошибка. Неподходящий размер вольера для животного");
                    }
                } catch (WrongCageException ex) {ex.printStackTrace();} }
            else { try {
                    throw new WrongAnimalException("Ошибка. Плотоядное животное нельзя поместить в данный вольер");
                } catch (WrongAnimalException e) { e.printStackTrace();

                }
            }

            }
        }






