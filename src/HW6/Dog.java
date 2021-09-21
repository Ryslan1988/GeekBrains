package HW6;

public class Dog extends Animal {
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void run(int obstacle) {
        if (obstacle < 500) {
            System.out.println(name + " run " + obstacle + " m " + " ,Hi is: " + age + " year ");
        } else {
            System.out.println(name + " Cannot run more then 500 m");
        }
    }

    @Override
    public void toSwim(int obstacle) {
        if (obstacle < 10) {
            System.out.println(name + " swim " + obstacle + " m " + " ,Hi is: " + age + " year ");
        } else {
            System.out.println(name + " Cannot swim more then 10 m");
        }
    }
}
