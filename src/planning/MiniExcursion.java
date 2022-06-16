package planning;

import java.util.ArrayList;
import java.util.List;

public class MiniExcursion {
    private String libelleMiniExcursion;
    private int nbrePlace;
    List<Etape> lesEtapes = new ArrayList<>();

    public MiniExcursion(String libelleMiniExcursion, int nbrePlace, List<Etape> lesEtapes) {
        this.libelleMiniExcursion = libelleMiniExcursion;
        this.nbrePlace = nbrePlace;
        this.lesEtapes = lesEtapes;
    }

    public int getNumMiniExcursion() {
       // retourne le numéro de l'excursion
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

    public void ajouteEtape(uneEtape)     {
        // ajoute une etape à l'excurison
        //lesEtapes.add(uneEtape);
    }

    public int donneDureePrevue() {
        // retourne la durée prévue formatée en minutes
    }

}
