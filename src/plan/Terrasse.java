package plan;

public class Terrasse extends Emplacement{

    protected Terrasse(int couleur, int xCentre, int yCentre) {
        super(couleur, xCentre, yCentre);
    }

    @Override
    int affiche() {
        return this.getxCentre();
    }
}
