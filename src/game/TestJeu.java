package game;

import java.util.Scanner;

public class TestJeu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int generateNumber =  1 + (int)(Math.random()* 100);

        int nbrCoupMax = 10;
        int coup = 0;

        while(coup < 10) {
            System.out.println("Donnez un nombre entre 1 et 100");
            int nombreUser =  sc.nextInt();
            if(nombreUser > 1 && nombreUser < 100) {
                if (nombreUser == generateNumber) {
                    System.out.println("Gagner !!");
                    break;
                } else if(nombreUser < generateNumber) {
                    System.out.println("Le nombre est trop petit");
                } else if (nombreUser > generateNumber) {
                    System.out.println("Le nombre est trop grand");
                }
                coup++;
            } else {
                System.out.println("Le nombre doit être entre 1 & 100");
            }
        }
        System.out.println(generateNumber);
    }
}
