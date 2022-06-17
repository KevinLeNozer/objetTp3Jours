package forme;

public class Rectangle implements Forme{
    private int longueur;
    private int largeur;

    public Rectangle(int longueur, int largeur) {
        this.longueur= longueur;
        this.largeur = largeur;
    }
    @Override
    public double calculAir() {
        return longueur * largeur;
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Rectangle{");
        sb.append("longueur=").append(longueur);
        sb.append(", largeur=").append(largeur);
        sb.append('}');
        return sb.toString();
    }
}
