package forme;

import java.util.Scanner;

public class TestForme {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Quelle forme voulez-vous : Triangle, Carré, Rectangle, Cercle, Losange");
        String forme = sc.nextLine();

        System.out.println("Quelle est le rayon du cercle");
        Double rayon = sc.nextDouble();

        Cercle cercle = new Cercle(rayon);

        System.out.println(cercle.calculAir());

        //Eléments saisi par l'utilisateur
        /*System.out.println("Quelle est la longueur de la base");
        int base = sc.nextInt();

        System.out.println("Quelle est la longueur de la hauteur");
        int hauteur = sc.nextInt();*/



        //Carre carre = new Carre(base);
        //Rectangle rectangle = new Rectangle(base, hauteur);
        //Losange losange = new Losange(base, hauteur);


    }
}
