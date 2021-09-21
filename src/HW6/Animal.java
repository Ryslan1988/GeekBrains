package HW6;

public class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {
    }

    public void run(int obstacle){
        System.out.println(name + " run " + obstacle+" m "+" ,Hi is: "+age +" year ") ;
    }

    public void toSwim(int obstacle){
        System.out.println(name + " swim" + obstacle+" m "+ " ,Hi is: "+age +" year ");
    }
}
