package Entities.Exo1;

public class Forage extends Captage implements IVolume
{
    private int diametre;

    public Forage(int idCaptage, String nom, String hauteur, String débitMaximum, int diametre) {
        super(idCaptage, nom, hauteur, débitMaximum);
        this.diametre = diametre;
    }

    public int getDiametre() {
        return diametre;
    }

    public void setDiametre(int diametre) {
        this.diametre = diametre;
    }

    @Override
    public double getVolume(int valeur1, int valeur2) {
        double volume = valeur1 * valeur2 * Math.PI;
        return volume;
    }
}
