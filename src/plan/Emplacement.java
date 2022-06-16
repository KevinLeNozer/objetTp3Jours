package plan;

public abstract class Emplacement {
    private int dimension;
    private int couleur;
    private int xCentre;
    private int yCentre;

    // constructeur ecrit dans le parent qui ne peut être utilisé que par les classes filles
    protected Emplacement(int couleur, int xCentre, int yCentre) {
        this.setCouleur(couleur);
        this.setxCentre(xCentre);
        this.setyCentre(yCentre);
    }

    abstract int affiche();

    public int getCouleur() {
        return couleur;
    }

    public void setCouleur(int couleur) {
        this.couleur = couleur;
    }

    public int getxCentre() {
        return xCentre;
    }

    public void setxCentre(int xCentre) {
        this.xCentre = xCentre;
    }

    public int getyCentre() {
        return yCentre;
    }

    public void setyCentre(int yCentre) {
        this.yCentre = yCentre;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Emplacement{");
        sb.append("dimension=").append(dimension);
        sb.append(", couleur=").append(couleur);
        sb.append(", xCentre=").append(xCentre);
        sb.append(", yCentre=").append(yCentre);
        sb.append('}');
        return sb.toString();
    }
}
