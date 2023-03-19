import animals.*;
import animals.behavior.Swim;
import cages.CageCarnivoros;
import cages.CageHerbivore;
import enums.CageSize;
import food.Food;
import food.Grass;
import food.Meat;

public class Zoo {
    public static void main(String[] args) {

        Bear bear = new Bear("Robin", 1.2f, 3);
        Duck duck = new Duck("Gretta", 1f, 5);
        FishShark fishShark = new FishShark("Tom", 2f, 4);
        Monkey monkey = new Monkey("Freddy", 0.8f, 6);
        Rabbit rabbit = new Rabbit("Sally", 0.2f, 5);
        Tiger tiger = new Tiger("Boris", 4f, 7);
        Tiger tiger2 = new Tiger("Timmy", 1f, 2);

        Worker worker = new Worker("Ivan", "Maintenance");

        Food eat1 = new Grass("bread", 2);
        Food eat2 = new Meat("carcass", 1);

        worker.feed(bear, eat1);
        worker.feed(fishShark, eat2);
        worker.feed(tiger, eat2);
        worker.feed(tiger, eat1);
        worker.feed(duck, eat1);
        worker.feed(bear, eat2);
        worker.feed(monkey, eat1);
        worker.feed(monkey, eat2);

        worker.getVoice(tiger);
        worker.getVoice(bear);
        worker.getVoice(duck);
        worker.getVoice(rabbit);

        Swim[] pond = new Swim[]{duck, fishShark, tiger};
        for (Swim swim : pond) {
            swim.swimming();
        }

        CageCarnivoros cage1 = new CageCarnivoros(5, CageSize.MAX);
        CageHerbivore cage2 = new CageHerbivore(7, CageSize.MIDDLE);

        cage2.addAnimals(monkey, monkey);
        cage2.addAnimals(tiger, tiger);
        cage2.addAnimals(fishShark, fishShark);
        cage2.addAnimals(rabbit, rabbit);

        System.out.println(cage2.getListAnimals());

        cage1.addAnimals(bear, bear);
        cage1.addAnimals(bear, bear);
        cage1.addAnimals(tiger, tiger);
        cage1.addAnimals(monkey, monkey);
        cage1.addAnimals(tiger2, tiger2);

        System.out.println(cage1.getListAnimals());

        cage1.getLink(bear);
        cage1.getLink(tiger);

        cage1.deleteAnimal(tiger);

        System.out.println(cage1.getListAnimals());
    }
}
