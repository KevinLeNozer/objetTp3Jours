package planning;

import java.time.LocalDate;
import java.util.List;

public class MiniExcursionPayante extends MiniExcursion{
    private int tarif;

    public MiniExcursionPayante(String libelleMiniExcursion, int nbrePlace, List<Etape> lesEtapes, float tarif) {
        super(libelleMiniExcursion, nbrePlace, lesEtapes);
    }

    public float getTarif() {
        // retourne le tarif
        return tarif;
    }
    public void setTarif(float tarif) {
        //redéfini le tarif
    }

}
