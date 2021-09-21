package HW7;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int action;
        Cat[] allCats = new Cat[5];
        allCats[0] = new Cat("Manny", 5, false);
        allCats[1] = new Cat("Kerry", 30, false);
        allCats[2] = new Cat("Steck", 10, false);
        allCats[3] = new Cat("Butch", 45, false);
        allCats[4] = new Cat("Paro", 10, false);


        Plate plate = new Plate(70);
        plate.info();
        for (int i = 0; i < allCats.length; i++) {
            if (allCats[i].satiety == false && allCats[i].appetite < plate.food){
                allCats[i].eat(plate);
                allCats[i].satiety = true;
                System.out.println("Cat " + allCats[i].name + " hi is ate!");
            } else {
                System.out.println("Cat " + allCats[i].name + " hi is didn't eat!");
            }
        }
        plate.info();
        System.out.println(" How much food to add to the bowl?");
        action = sc.nextInt();
        plate.increaseFood(action);
        plate.info();

    }
    }

