package forme;

public class Carre implements Forme {
    private int cote;

    public Carre(int cote) {
        this.setCote(cote);
    }

    public int getCote() {
        return cote;
    }

    public void setCote(int cote) {
        this.cote = cote;
    }

    @Override
    public double calculAir() {
        return cote * cote;
    }

}
