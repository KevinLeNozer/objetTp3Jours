package collection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class TestCollection {
    public static void main(String[] args) {

        Collection<Integer> maCol = new ArrayList<>();

        maCol.add(12);
        maCol.add(8);
        maCol.add(18);
        maCol.add(3);
        maCol.add(121);
        maCol.add(81);
        maCol.add(181);
        maCol.add(31);

        for (Integer el : maCol) {
            System.out.println(el);
        }
    }
}
