package Tools;

import Entities.Exo1.Captage;
import Entities.Exo1.Cuve;
import Entities.Exo1.Forage;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModelJTable extends AbstractTableModel
{

    private String[] colonnes;
    private Object[][] lignes;
    @Override
    public int getRowCount() {
        return lignes.length;
    }

    @Override
    public int getColumnCount() {
        return colonnes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return lignes[rowIndex][columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return colonnes[column];
    }

    public  void loadDatasCaptage(ArrayList<Captage> uneListe){
        colonnes = new String[]{"IdCaptage","Nom", "Hauteur","DébitMaximum"};
        lignes = new Object[uneListe.size()][4];
        int i = 0;
        for (Captage captage: uneListe){
            lignes[i][0] = captage.getIdCaptage();
            lignes[i][1] = captage.getNom();
            lignes[i][2] = captage.getHauteur();
            lignes[i][3] = captage.getDébitMaximum();

            i++;
        }
    }
}
