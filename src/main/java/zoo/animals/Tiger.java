package zoo.animals;

import zoo.animals.behavior.Run;
import zoo.animals.behavior.Swim;
import zoo.animals.behavior.Voice;
import zoo.enums.CageSize;

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
