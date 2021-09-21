package Java2HW1;

public class Road implements Hurdles {
    private int length;

    public Road(int length) {
        this.length = length;
    }

    public String check(Gamer gamer) {
        gamer.runStr();
        gamer.setSuccess(gamer.getMaxLength() >= length);
        if (gamer.getSuccess()) {

            return "Игрок " + gamer.getName() + " проходит дистанцию длиной: " + length + " км";
        } else {

            return "Игрок " + gamer.getName() + " не проходит дистанцию длиной: " + length + " км";
        }
    }
}
