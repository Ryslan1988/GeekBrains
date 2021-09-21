package Java2HW1;

public class Human implements Gamer {
    private String name;
    private int maxLength;
    private int maxHeight;
    private boolean success = true;

    public Human(String name, int maxHeight, int maxLength) {
        this.name = name;

    }

    public String runStr() {
        return name + " может пробежать " +maxLength+"km" ;
    }
    public String jumpStr() {
        return name + " может прыгнуть " +maxHeight + "cm" ;
    }
    public String getName() {
        return name;
    }

    public static String setName(String name) {

        return name;
    }

    public boolean getSuccess() {
        return success;
    }

    @Override
    public int getMaxLength() {
        return getMaxLength();
    }

    @Override
    public int getMaxHeight() {
        return getMaxHeight();
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}