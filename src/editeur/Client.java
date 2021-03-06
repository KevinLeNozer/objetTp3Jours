package editeur;

public class Client {
    String nom;
    String prenom;
    int cp;
    String ville;

    public Client(String nom, String prenom, int cp, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.cp = cp;
        this.ville = ville;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", cp=" + cp +
                ", ville='" + ville + '\'' +
                '}';
    }
}
