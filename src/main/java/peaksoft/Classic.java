package peaksoft;

public class Classic implements Music{
    private int foundationCentury;
    public void getMusicGenre() {
        System.out.println("I am classic singer!");
    }
    public Classic(int foundationCentury) {
        this.foundationCentury = foundationCentury;
    }

    public Classic() {
    }

    public int getFoundationCentury() {
        return foundationCentury;
    }

    public void setFoundationCentury(int foundationCentury) {
        this.foundationCentury = foundationCentury;
    }

    @Override
    public String toString() {
        return "Classic{" +
                "foundationCentury=" + foundationCentury +
                '}';
    }
}
