package plan;

public class Etalage extends Emplacement{

    protected Etalage(int couleur, int xCentre, int yCentre) {
        super(couleur, xCentre, yCentre);
    }

    @Override
    int affiche() {
        return this.getyCentre();
    }
}
