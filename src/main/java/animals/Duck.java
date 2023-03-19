package animals;

import animals.behavior.Fly;
import animals.behavior.Swim;
import animals.behavior.Voice;
import enums.CageSize;

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
