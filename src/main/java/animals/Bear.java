package animals;

import animals.behavior.Run;
import animals.behavior.Voice;
import enums.CageSize;

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
