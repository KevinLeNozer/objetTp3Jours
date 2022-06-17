package forme;

public class Carre implements Forme {
    private int cote;

    public Carre(int cote) {
        this.cote = cote;
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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Carre{");
        sb.append("cote=").append(cote);
        sb.append('}');
        return sb.toString();
    }
}
