package planning;

import java.time.LocalTime;

public class Etape {
    private static int numEtape;
    private String descriptionPrevue;
    private int dureePrevue;

    public Etape(String descriptionPrevue, int dureePrevue) {
        // construit l'objet avec les valeurs passées en paramètres
        // le numéro de l'étape est directement construit grâce au nombre d'étape
        this.descriptionPrevue = descriptionPrevue;
        this.dureePrevue = dureePrevue;
        this.setNumEtape();
    }

    public int getDureePrevue() {
        return dureePrevue;
    }

    public void setDureePrevue(int dureePrevue) {
        this.dureePrevue = dureePrevue;
    }

    public int getNumEtape() {
        // retourne le numéro de l'étape
        return numEtape;
    }

    public void setNumEtape() {
        this.numEtape++;
    }

    public String getDescriptionPrevue() {
        // retourne la description
        return descriptionPrevue;
    }

    public LocalTime donneDureePrevueHHMM() {
        //retourne la durée prévue sous la forme HH:MM:SS exemple 02:05:23
        int heure = dureePrevue / 60;
        int minute = dureePrevue % 60;
        LocalTime value = LocalTime.of(heure, minute);
        return value;
    }
}
