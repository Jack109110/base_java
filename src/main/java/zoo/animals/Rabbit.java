package zoo.animals;

import zoo.animals.behavior.Run;
import zoo.animals.behavior.Voice;
import zoo.enums.CageSize;

public class Rabbit extends Herbivore implements Run, Voice {

    {
        dimeshionCage = CageSize.LOW;
    }

    public Rabbit(String name, float age, int satiety) {
        super(name, age, satiety);
    }

    @Override
    public void running() {
        System.out.println("Кролик умеет бегать");
    }

    @Override
    public String voicing() {
        return "Кролик урчит";
    }


}
