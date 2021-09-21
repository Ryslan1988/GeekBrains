package HW6;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("kotlin",2);
        cat.run(150);
        cat.toSwim(250);

        Dog dog = new Dog("javax",1);
        dog.run(100);
        dog.toSwim(5);
    }
}
