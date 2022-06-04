package table;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ClienteTM extends AbstractTableModel {

    private List<String[]> linhas;
    private String[] colunas = new String[]{"Nome", "CPF", "Email", "Telefone"};

    public ClienteTM() {
        linhas = new ArrayList<>();
    }

    public ClienteTM(List<String[]> list) {
        linhas = new ArrayList<>(list);
    }

    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int i, int j) {
        String[] aux = linhas.get(i);

        switch (j) {
            case 0:
                return aux[0];
            case 1:
                return aux[1];
            case 2:
                return aux[2];
            case 3:
                return aux[3];
            default:
                throw new IndexOutOfBoundsException("Indice não exite");
        }
    }

}
