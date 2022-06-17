package forme;

public class Losange implements Forme{
    private int grandDiagonale;
    private int petiteDiagonale;

    public Losange(int grandDiagonale, int petiteDiagonale) {
        this.grandDiagonale = grandDiagonale;
        this.petiteDiagonale = petiteDiagonale;
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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Losange{");
        sb.append("grandDiagonale=").append(grandDiagonale);
        sb.append(", petiteDiagonale=").append(petiteDiagonale);
        sb.append('}');
        return sb.toString();
    }
}
