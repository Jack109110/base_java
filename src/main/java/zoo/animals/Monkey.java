package zoo.animals;

import zoo.animals.behavior.Run;
import zoo.animals.behavior.Voice;
import zoo.enums.CageSize;

public class Monkey extends Herbivore implements Run, Voice {

    {
        dimeshionCage = CageSize.MIDDLE;
    }

    public Monkey(String name, float age, int satiety) {
        super(name, age, satiety);
    }

    @Override
    public void running() {
        System.out.println("Обезьяна умеет бегать");
    }

    @Override
    public String voicing() {
        return "Обезьяна издает звуки";
    }

}
