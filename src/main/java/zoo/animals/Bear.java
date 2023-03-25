package zoo.animals;

import zoo.animals.behavior.Run;
import zoo.animals.behavior.Voice;
import zoo.enums.CageSize;

public class Bear extends Carnivorous implements Run, Voice {

    {
        dimeshionCage = CageSize.MAX;
    }

    public Bear(String name, float age, int satiety) {
        super(name, age, satiety);
    }


    @Override
    public String voicing() {
        return "Медведь рычит";
    }

    @Override
    public void running() {
        System.out.println("Медведь умеет бегать");
    }


}
