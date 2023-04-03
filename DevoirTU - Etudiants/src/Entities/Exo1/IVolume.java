package Entities.Exo1;

public interface IVolume
{
    public default double volumeForage(int diametre, int hauteur)
    {
        double volume = Math.PI * diametre * hauteur;
        return volume;
    }
    public default double volumeCuve(int longeur , int largeur){
        double volume = longeur*largeur;
        return volume;
    }

}
