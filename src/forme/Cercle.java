package forme;

public class Cercle implements Forme{
    private Double rayon;

    public Cercle(Double rayon) {
        this.setRayon(rayon);
    }

    public Double getRayon() {
        return rayon;
    }

    public void setRayon(Double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double calculAir() {
        return Math.pow(rayon, 2) * Math.PI;
    }

}
