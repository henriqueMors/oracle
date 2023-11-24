import java.util.Random;

import javax.swing.JOptionPane;

public class FlipCoin {

    public static void main(String[] args) {

        // 50% chance heads, 50% chance tails
        Random rand = new Random();
        int chance = rand.nextInt(10);
        if ( chance < 0 ) {
            //System.out.println("cara");
            JOptionPane.showMessageDialog(null, "CARA", "Lado da moeda", 1);
        }
        else {
            JOptionPane.showMessageDialog(null, "CORÔA", "Lado da moeda", 1);
            //System.out.println("coroa");
        }

        System.out.println(chance);
    }
}

