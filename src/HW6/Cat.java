package HW6;

public class Cat extends Animal {
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void run(int obstacle) {
        if (obstacle < 200) {
            System.out.println(name + " run " + obstacle + " m " + " ,Hi is: " + age + " year ");
        } else {
            System.out.println(name + " Cannot run more then 200 m");
        }
    }

    @Override
    public void toSwim(int obstacle) {
        System.out.println(name + " Can not swim");
    }
}

