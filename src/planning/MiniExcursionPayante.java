package planning;

import java.time.LocalDate;
import java.util.List;

public class MiniExcursionPayante extends MiniExcursionPlanifie{
    private int tarif;

    public MiniExcursionPayante(LocalDate heureDepart, int nbreInscrits, List<Etape> lesEtapes, float tarif) {
        super(heureDepart, nbreInscrits);
    }

    public float getTarif() {
        // retourne le tarif
    }
    public void setTarif(float tarif) {
        //redéfini le tarif
    }

}
