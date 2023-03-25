package zoo.animals;

import zoo.animals.behavior.Swim;
import zoo.enums.CageSize;

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
