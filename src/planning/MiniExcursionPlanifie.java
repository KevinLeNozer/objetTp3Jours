package planning;

import java.time.LocalDate;

public class MiniExcursionPlanifie {
    private LocalDate heureDepart;
    private int nbreInscrits;

    public boolean estComplete() {
        //retourne vrai si le nombre d'inscrit est égal au nombre de places prévues dans la mini excursion
        if (nbreInscrits == getLaminiExcursion().getNbrePlace()) {
            return true;
        }else {
            return false;
        }
    }

    public MiniExcursion getLaminiExcursion() {
        // retourne la mini excursion correspondante à
        // l'excursion planifiée
    }

    public MiniExcursionPlanifie(LocalDate heureDepart, int nbreInscrits) {
        this.setHeureDepart(heureDepart);
        this.setNbreInscrits(nbreInscrits);
    }

    public LocalDate getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(LocalDate heureDepart) {
        this.heureDepart = heureDepart;
    }

    public int getNbreInscrits() {
        return nbreInscrits;
    }

    public void setNbreInscrits(int nbreInscrits) {
        this.nbreInscrits = nbreInscrits;
    }
}
