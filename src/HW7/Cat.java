package HW7;

public class Cat {
    public String name;
    public int appetite;
    public boolean satiety;

    public Cat(String name, int appetite, boolean satiety ) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;

    }

    public void eat(Plate plate) {
        plate.decreaseFood(appetite);
    }

}
