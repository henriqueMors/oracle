package programa;

import javax.swing.JOptionPane;

public class jOptionPane {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "info", "info", 3); // caixa de diálogo
        String nome = JOptionPane.showInputDialog("Informe seu nome:", "Insira o nome aqui"); // caixa para iniciar variável
        
        System.out.println(nome);
        
    }
    
}
