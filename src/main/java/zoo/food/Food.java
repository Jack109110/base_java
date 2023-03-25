package zoo.food;

public abstract class Food {

    public String name;
    public int quantity;

    public Food() {
    }

    public Food(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
}