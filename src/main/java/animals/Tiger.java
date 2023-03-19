package animals;

import animals.behavior.Run;
import animals.behavior.Swim;
import animals.behavior.Voice;
import enums.CageSize;

public class Tiger extends Carnivorous implements Run, Swim, Voice {

    {
        dimeshionCage = CageSize.MAX;
    }

    public Tiger(String name, float age, int satiety) {
        super(name, age, satiety);
    }

    @Override
    public String voicing() {
        return "Тигр рычит";
    }

    @Override
    public void swimming() {
        System.out.println("Тигр плавает");
    }

    @Override
    public void running() {
        System.out.println("Тигр умеет бегать");
    }

}
