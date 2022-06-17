package forme;

public class Cercle implements Forme{
    private Double rayon;

    public Cercle(Double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double calculAir() {
        return Math.pow(rayon, 2) * Math.PI;
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cercle{");
        sb.append("rayon=").append(rayon);
        sb.append('}');
        return sb.toString();
    }
}
