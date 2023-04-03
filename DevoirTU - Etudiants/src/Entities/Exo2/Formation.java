package Entities.Exo2;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Formation
{
    private int idFormation;
    private String nomFormation;
    private int prixFormation;

    private ArrayList<Participant> lesParticipants;

    public Formation(int idFormation, String nomFormation, int prixFormation) {
        this.idFormation = idFormation;
        this.nomFormation = nomFormation;
        this.prixFormation = prixFormation;
        this.lesParticipants = new ArrayList<>();
    }

    public void AjouterParticipant(Participant unParticipant)
    {
        lesParticipants.add(unParticipant);

    }

    // Cette méthode permet de compter le nombre de participants
    // réellement présents à la formation.
    public int GetNombreDePresents()
    {
        int compteur =0;
        int ingrement = 0;
        while (compteur<=lesParticipants.size())
        {
            if (lesParticipants.get(compteur).isEstPresent() == true)
            {
                ingrement = ingrement + 1;
            }

          compteur = compteur+1;
        }
        return ingrement;
    }

    // Cette méthode permet de calculer le montant total
    // des frais kilométriques versés pour une formation
    // en ne prenant en compte que les participants présents.
    // On rembourse 1.89 du KM
    public double CalculerFraisRemboursementKilometriques()
    {
        int addition = 0;
        int compteur = 0;
        double multiplication = 0;
        while (compteur<=lesParticipants.size())
        {
            if (lesParticipants.get(compteur).isEstPresent() == true)
            {
                addition = lesParticipants.get(compteur).getNbKm() + addition;
            }
            compteur = compteur +1;
        }
        multiplication = addition *1.89;
        return multiplication;
    }

    // Cette méthode permet de calculer le taux de présence
    // par rapport au nombre d'inscrits
    public double TauxDePresence()
    {
        int tpres = 0;
        tpres = lesParticipants.size()-GetNombreDePresents();
        return tpres;
    }

    // Cette méthode permet de calculer le bénéfice de la formation.
    // Ce dernier se détermine en multipliant le nombre de présents par le prix de la formation moins
    // les frais kilométriques versés
    public double BeneficeFormation()
    {
        // A compléter ici
        return  0;
    }
}
