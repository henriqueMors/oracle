import javax.swing.JOptionPane;

public class Calculator2 {

    public double tax = .05;
    public double tip = .15;  //Change tax and tip if you prefer different values
    public double originalPrice = 0;
    
    public void findTotal(){

        double total = originalPrice*(tax+tip);
        JOptionPane.showMessageDialog(null, total, null, 1);
        //Calculate an individual's total after tax and tip
        //Print this value
    }
}
