package programa;

import javax.swing.JOptionPane;

public class consumidor {
    public static void main(String[] args) {
        
        String aux;
        int qtdPes;
        aux = JOptionPane.showInputDialog(null, "Insira a quantidade de pessoas: ", "Número de pessoas", 0);
        qtdPes = Integer.parseInt(aux);

        
        //JOptionPane.showMessageDialog(null, "essa " + qtdPes);

    }
}
