import java.util.Scanner;

import javax.swing.JOptionPane;

public class AgeValidity {

    public static void main(String[] args) {
       int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe idade", 0));
       if (idade < 18) { 
        JOptionPane.showMessageDialog(null, "NAO PODE DIRIGIR!", null, 1);
       }
       else
       {
        JOptionPane.showMessageDialog(null, "PODE DIRIGIR!", null, 1);
       }
    }
}
