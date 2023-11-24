import javax.swing.JOptionPane;

import programa.jOptionPane;

public class NameMaker {
    
    public static void main(String args[]){
        
        String firstName = JOptionPane.showInputDialog(null, "Insira seu primeiro nome: ");
        String middleName= JOptionPane.showInputDialog(null, "Insira seu nome intemediário: ");
        String lastName = JOptionPane.showInputDialog(null, "Insira seu último nome: ");
        String fullName = (firstName+ " " + middleName + " " + lastName);
        
        JOptionPane.showMessageDialog(null, fullName, "Foi informado", 0);

        System.out.println(fullName);
        //System.out.println(firstName + " " + middleName + " " +lastName);
    }
    
}
