package Java2HW1;

public class Wall implements Hurdles {
        private int height;

        public Wall(int height) {
                this.height = height;
        }

        public String check(Gamer gamer) {
                gamer.jumpStr();
                gamer.setSuccess(gamer.getMaxHeight() >= height);
                if (gamer.getSuccess()) {

                        return "Игрок " + gamer.getName() + " перепрыгнул стену высотой: " + height + " м";
                } else {

                        return "Игрок " + gamer.getName() + " не перепрыгнул стену высотой: " + height + " м";
                }
        }


}
