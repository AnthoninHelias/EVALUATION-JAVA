package Entities.Exo1;

public class Captage
{
    private int idCaptage;
    private String nom;
    private String mètre;
    private String litres;

    public Captage(int idCaptage, String nom, String mètre, String litres) {
        this.idCaptage = idCaptage;
        this.nom = nom;
        this.mètre = mètre;
        this.litres = litres;
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
    int getDescription()
    {
        return  idCaptage , nom , mètre , litres;
    }
    compareTo(Captage)
    {

    }
}
