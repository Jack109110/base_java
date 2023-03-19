package animals;

import enums.CageSize;
import exceptions.WrongFoodException;
import food.Food;
import food.Meat;

public abstract class Carnivorous extends Animals{



    public Carnivorous(String name, float age, int satiety) {
        super(name, age, satiety);

    }

    @Override
    public String eat (Food food) {
        try {
            if (food instanceof Meat) {
                return "животное покушало";
            } else {
                throw new WrongFoodException("Ошибка! животное такую еду не ест.");
            }
        } catch (WrongFoodException ex) {ex.printStackTrace();}

        return null;
    }

}
