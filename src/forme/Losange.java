package forme;

public class Losange implements Forme{

    private int grandDiagonale;
    private int petiteDiagonale;

    public Losange(int grandDiagonale, int petiteDiagonale) {
        this.setGrandDiagonale(grandDiagonale);
        this.setPetiteDiagonale(petiteDiagonale);
    }

    public int getGrandDiagonale() {
        return grandDiagonale;
    }

    public void setGrandDiagonale(int grandDiagonale) {
        this.grandDiagonale = grandDiagonale;
    }

    public int getPetiteDiagonale() {
        return petiteDiagonale;
    }

    public void setPetiteDiagonale(int petiteDiagonale) {
        this.petiteDiagonale = petiteDiagonale;
    }

    @Override
    public double calculAir() {
        return (grandDiagonale * petiteDiagonale)/2f;
    }
}
