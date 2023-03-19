package cages;

import animals.Animals;
import animals.Carnivorous;
import enums.CageSize;
import exceptions.WrongCageException;

import java.util.HashMap;

public abstract class Cage<T, B> {

    T quantity;
    CageSize dimenshion;

    private HashMap<String, B> listAnimals = new HashMap<String, B>();

    public HashMap<String, B> getListAnimals() {
        return listAnimals;
    }

    public void setListAnimals(HashMap<String, B> listAnimals) {
        this.listAnimals = listAnimals;
    }

    public Cage(T quantity, CageSize dimenshion) {
        this.quantity = quantity;
        this.dimenshion = dimenshion;
    }


    public void deleteAnimal(Animals animals) {
        listAnimals.remove(animals.name);
    }

    public void getLink(Animals animals) {
        System.out.println(listAnimals.get(animals.name));
    }

}


