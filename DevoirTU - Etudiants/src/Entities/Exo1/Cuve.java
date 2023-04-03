package Entities.Exo1;

public class Cuve extends Captage
{
    private int longeur;
    private int largeur;

    public Cuve(int idCaptage, String nom, String mètre, String litres, int longeur, int largeur) {
        super(idCaptage, nom, mètre, litres);
        this.longeur = longeur;
        this.largeur = largeur;
    }

    public int getLongeur() {
        return longeur;
    }

    public void setLongeur(int longeur) {
        this.longeur = longeur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }
}
