package planning;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class MiniExcursion {
    private String libelleMiniExcursion;
    private int nbrePlace;
    private int numMiniExcursion;
    private static int nombreExcursion = 0;
    List<Etape> lesEtapes = new ArrayList<>();

    public MiniExcursion(String libelleMiniExcursion, int nbrePlace, List<Etape> lesEtapes) {
        this.setLibelleMiniExcursion(libelleMiniExcursion);
        this.setNbrePlace(nbrePlace);
        this.lesEtapes = lesEtapes;
        this.setNumMiniExcursion();
        nombreExcursion++;
    }

    public int getNumMiniExcursion() {
       // retourne le numéro de l'excursion
        return numMiniExcursion;
    }

    public void setNumMiniExcursion() {
        this.numMiniExcursion = nombreExcursion;
    }

    public String getLibelleMiniExcursion() {
        // retourne le libellé
        return libelleMiniExcursion;
    }

    public int getNbrePlace() {
        // retourne le nombre de place disponible pour cette excursion
        return nbrePlace;
    }

    public void setLibelleMiniExcursion(String libelleMiniExcursion) {
        // redéfinit le libellé de l'excursion
    }

    public void setNbrePlace(int nbrePlace) {
        // redéfinit le nombre de place disponibles de l'excursion
    }

    public void ajouteEtape(Etape uneEtape) {
        // ajoute une etape à l'excurison
        lesEtapes.add(uneEtape);
    }

    public int donneDureePrevue() {
        // retourne la durée prévue formatée en minutes
        return donneDureePrevue();
    }
    public LocalTime donneDureePrevueHHMM() {
        int dureePrevueTotal = 0;
        for (Etape lesEtapes: lesEtapes) {
            dureePrevueTotal += lesEtapes.getDureePrevue();
        }
        int heure = dureePrevueTotal / 60;
        int minute = dureePrevueTotal % 60;

        LocalTime value = LocalTime.of(heure, minute);
        return value;
    }
}
