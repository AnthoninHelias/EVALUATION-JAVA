package Entities.Exo1;

public class Captage
{
    private int idCaptage;
    private String nom;
    private String hauteur;
    private String débitMaximum;

    public Captage(int idCaptage, String nom, String hauteur, String débitMaximum) {
        this.idCaptage = idCaptage;
        this.nom = nom;
        this.hauteur = hauteur;
        this.débitMaximum = débitMaximum;
    }

    public String getHauteur() {
        return hauteur;
    }

    public void setHauteur(String hauteur) {
        this.hauteur = hauteur;
    }

    public String getDébitMaximum() {
        return débitMaximum;
    }

    public void setDébitMaximum(String débitMaximum) {
        this.débitMaximum = débitMaximum;
    }

    public int getIdCaptage() {
        return idCaptage;
    }

    public void setIdCaptage(int idCaptage) {
        this.idCaptage = idCaptage;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMètre() {
        return mètre;
    }

    public void setMètre(String mètre) {
        this.mètre = mètre;
    }

    public String getLitres() {
        return litres;
    }

    public void setLitres(String litres) {
        this.litres = litres;
    }

    compareTo(Captage)
    {

    }
}
