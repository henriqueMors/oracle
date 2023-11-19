package programa;

import java.util.Scanner;

public class inputScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o nome: ");
        String nome = input.nextLine();

        System.out.println("O seu nome então é " + nome);


        input.close();
    }
    
}
