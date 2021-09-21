package Java2HW1;

public class Main {
    public static void main(String[] args) {


        Gamer catPirat = new Cat("Пират",2,5);
        Gamer catMyrzik = new Cat("Мурзик",5,8);

        Gamer humanOleg = new Human("Олег",1,23);
        Gamer humanAnton = new Human("Антон",3,8);

        Gamer robotKris = new Robot("Крис",7,12);
        Gamer robotVolf = new Robot("Вольф",2,11);

        Gamer[] gamers = {catPirat, catMyrzik, humanOleg, humanAnton, robotKris, robotVolf};

        Hurdles wall1 = new Wall(1);
        Hurdles wall2 = new Wall(7);

        Hurdles road1 = new Road(3);
        Hurdles road2 = new Road(5);

        Hurdles[] hurdles = {wall1, wall2, road1, road2};

        for (int i = 0; i < hurdles.length; i++) {

            for (Gamer gamer : gamers) {
                if (gamer.getSuccess()) {
                    hurdles[i].check(gamer);
                }


            }
        }
    }


}

