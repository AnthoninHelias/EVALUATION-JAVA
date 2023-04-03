package Entities.Exo1;
//import src/Entities/Exo1/IVolume.java;

public class Cuve extends Captage implements IVolume
{
    private int longeur;
    private int largeur;


    public Cuve(int idCaptage, String nom, int hauteur, int débitMaximum, int longeur, int largeur) {
        super(idCaptage, nom, hauteur, débitMaximum);
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
