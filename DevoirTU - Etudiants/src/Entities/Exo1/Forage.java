package Entities.Exo1;

public class Forage extends Captage
{
    private int diametre;

    public Forage(int idCaptage, String nom, String mètre, String litres, int diametre) {
        super(idCaptage, nom, mètre, litres);
        this.diametre = diametre;
    }

    public int getDiametre() {
        return diametre;
    }

    public void setDiametre(int diametre) {
        this.diametre = diametre;
    }
}
