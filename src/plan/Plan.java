package plan;

import java.util.ArrayList;
import java.util.List;

public class Plan {
    private int echelle;
    private String nomFichier;

    List<Emplacement> emplacementList = new ArrayList<>();

    public void ajouteEmplacement(Emplacement emplacement) {
        emplacementList.add(emplacement);
    }

    public void supprimeEmplacement(Emplacement emplacement) {

        if (emplacementList.contains(emplacement)) {
            emplacementList.remove(emplacement);
        }else {
            System.out.println("L'emplacement n'existe pas");
        }
    }

    public List<Emplacement> affiche() {
        return emplacementList;
    }

    public Plan(String nomFichier) {
        this.setNomFichier(nomFichier);
    }

    public int getEchelle() {
        return echelle;
    }

    public void setEchelle(int echelle) {
        this.echelle = echelle;
    }

    public String getNomFichier() {
        return nomFichier;
    }

    public void setNomFichier(String nomFichier) {
        this.nomFichier = nomFichier;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Plan{");
        sb.append("echelle=").append(echelle);
        sb.append(", nomFichier='").append(nomFichier).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
