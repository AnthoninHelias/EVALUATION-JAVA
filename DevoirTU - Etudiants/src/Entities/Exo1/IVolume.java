package Entities.Exo1;

public interface IVolume
{

    public default double getVolume(int valeur1 , int valeur2){
        double volume = valeur1*valeur2;
        return volume;
    }

}
