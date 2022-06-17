package generique;

public class TestGenerique {
    public static void main(String[] args) {
        ClasseAvecGenerique<String> objetAvecGeneric = new ClasseAvecGenerique<>();

        objetAvecGeneric.ajoute("TOTO");
        ClasseAvecGenerique<Integer> objetAvecGeneric2 = new ClasseAvecGenerique<>();
        objetAvecGeneric2.ajoute(15);

        System.out.println(objetAvecGeneric);
        System.out.println(objetAvecGeneric2);
    }
}
