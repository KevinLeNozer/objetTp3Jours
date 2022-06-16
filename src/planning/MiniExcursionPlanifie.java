package planning;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class MiniExcursionPlanifie {
    private LocalDateTime heurDepart;
    private int nbreInscrits;
    private MiniExcursion laMiniExcursion;

    public boolean estComplete() {
        //retourne vrai si le nombre d'inscrit est égal au nombre de places prévues dans la mini excursion
        if (nbreInscrits == getLaminiExcursion().getNbrePlace()) {
            return true;
        }
        return true;
    }

    public MiniExcursion getLaminiExcursion() {
        // retourne la mini excursion correspondante à
        // l'excursion planifiée
        return laMiniExcursion;
    }

    public MiniExcursionPlanifie(LocalDate heureDepart, int nbreInscrits, MiniExcursion laMiniExcursion) {
        this.setHeureDepart(heureDepart);
        this.setNbreInscrits(nbreInscrits);
        this.setLaMiniExcursion(laMiniExcursion);
    }
    public MiniExcursionPlanifie(String heureDepart, int nbreInscrits, MiniExcursion laMiniExcursion) {
        this.setHeureDepart(heureDepart);
        this.setNbreInscrits(nbreInscrits);
        this.setLaMiniExcursion(laMiniExcursion);
    }

    public void setLaMiniExcursion(MiniExcursion laMiniExcursion) {
        this.laMiniExcursion = laMiniExcursion;
    }

    public LocalDateTime getHeureDepart() {
        return heurDepart;
    }

    public void setHeureDepart(LocalDate heureDepart) {
        this.heurDepart = heurDepart;
    }

    public void setHeureDepart(String heureDepart) {
        this.heurDepart = LocalDateTime.of(LocalDate.now(), LocalTime.parse(heureDepart));
    }

    public int getNbreInscrits() {
        return nbreInscrits;
    }

    public void setNbreInscrits(int nbreInscrits) {
        this.nbreInscrits = nbreInscrits;
    }
}
