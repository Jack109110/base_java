package zoo.animals;

import zoo.animals.behavior.Fly;
import zoo.animals.behavior.Swim;
import zoo.animals.behavior.Voice;
import zoo.enums.CageSize;

public class Duck extends Herbivore implements Swim, Voice, Fly {


    {
        dimeshionCage = CageSize.MIN;
    }

    public Duck(String name, float age, int satiety) {
        super(name, age, satiety);
    }

    @Override
    public String voicing() {
        return "Утка крякает";
    }

    @Override
    public void swimming() {
        System.out.println("Утка плавает");
    }

    @Override
    public void flying() {
        System.out.println("Утка умеет летать");
    }




}
