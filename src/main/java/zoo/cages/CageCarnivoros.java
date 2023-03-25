package zoo.cages;

import zoo.animals.Animals;
import zoo.animals.Carnivorous;
import zoo.enums.CageSize;
import zoo.exceptions.WrongAnimalException;
import zoo.exceptions.WrongCageException;

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
