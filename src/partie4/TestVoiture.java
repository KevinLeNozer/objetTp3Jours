package partie4;

import java.awt.*;

public class TestVoiture {
    public static void main(String[] args) {
        Voiture voiture = new Voiture(123, "487505184", "Volkwsagen", Color.BLUE, 2017);
        System.out.println("La voiture sort de l'usine, elle a les caractéristiques suivants :"+voiture);
        Individu am = new Individu("Kevin","Le Nozer");
        voiture.setPropriaitaire(am);
        System.out.println("La voiture a été achetée par un individu , elle a maintenant les " +
                "caractéristiques suivants :"+voiture);
        voiture.demarrer();
    }
}
