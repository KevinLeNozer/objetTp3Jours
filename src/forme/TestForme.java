package forme;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestForme {
    public static void main(String[] args) {

        List<Object> formeListe = new ArrayList<>();

        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Quelle forme voulez-vous (triangle, carré, rectangle, cercle, losange) ?");
            String forme = sc.nextLine();

            if (forme.equals("rectangle") || forme.equals("triangle") || forme.equals("carre") || forme.equals("cercle") || forme.equals("losange"))
            {
                if (forme.equals("rectangle")) {
                    System.out.println("Quelle est la longueur de la base ?");
                    int logueurBase = sc.nextInt();
                    System.out.println("Quelle est la longueur de la hauteur ?");
                    int hauteurBase = sc.nextInt();
                    Rectangle rectangle = new Rectangle(logueurBase,hauteurBase);
                    System.out.println(rectangle.calculAir());
                    formeListe.add(rectangle);
                } else if (forme.equals("carre")) {
                    System.out.println("Quelle est la longueur de la base ?");
                    int cote = sc.nextInt();
                    Carre carre = new Carre(cote);
                    System.out.println(carre.calculAir());
                    formeListe.add(carre);
                } else if (forme.equals("cercle")) {
                    System.out.println("Quelle est la longueur de la base ?");
                    Double rayon = sc.nextDouble();
                    Cercle cercle = new Cercle(rayon);
                    System.out.println(cercle.calculAir());
                    formeListe.add(cercle);
                } else if (forme.equals("triangle")) {
                    System.out.println("Quelle est la longueur de la base ?");
                    int logueurBase = sc.nextInt();
                    System.out.println("Quelle est la longueur de la hauteur ?");
                    int hauteurBase = sc.nextInt();
                    Triangle triangle = new Triangle(logueurBase,hauteurBase);
                    System.out.println(triangle.calculAir());
                    formeListe.add(triangle);
                } else if (forme.equals("losange")) {
                    System.out.println("Quelle est la longueur de la base ?");
                    int grandeDiagonale = sc.nextInt();
                    System.out.println("Quelle est la longueur de la hauteur ?");
                    int petiteDiangonale = sc.nextInt();
                    Losange losange = new Losange(grandeDiagonale,petiteDiangonale);
                    System.out.println(losange.calculAir());
                    formeListe.add(losange);
                }
                System.out.println("Une autre forme (oui/non) ?");
                String question = sc.next();
                if (question.equals("non")) {
                    break;
                }
            } else {
                System.out.println(forme);
                System.out.println("Veuillez renseignez une forme valide");
            }
        }
        for (Object o : formeListe) {
            System.out.println(o.toString());
        }
    }
}
