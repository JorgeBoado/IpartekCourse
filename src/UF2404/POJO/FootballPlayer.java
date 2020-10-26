package UF2404.POJO;

public class FootballPlayer extends Person {
    private int dorsalNumber;

    public FootballPlayer() {
        super();
    }

    public int getDorsalNumber() {
        return dorsalNumber;
    }

    public void setDorsalNumber(int dorsalNumber) {
        this.dorsalNumber = dorsalNumber;
    }

    @Override
    public String toString() {
        return this.getName() + " con numero " + this.getDorsalNumber() + ".";
    }
}
