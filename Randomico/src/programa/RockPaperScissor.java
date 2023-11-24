import java.util.Random;

public class RockPaperScissor {

    public static void main(String[] args) {
        Random rdm = new Random(3);

        int sorteado = rdm.nextInt(3);

        if (sorteado == 0) {
            System.out.println("PEDRA");
        }
        else if (sorteado == 1) {
            System.out.println("PAPEL");
        }
        else {
            System.out.println("TESOURA");
        }

        System.out.println(sorteado);
    }
}
