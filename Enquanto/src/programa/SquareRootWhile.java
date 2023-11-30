package programa;

import java.util.Scanner;

public class SquareRootWhile {
    public static void main(String args[]){
    System.out.print("Type a non-negative integer: ");
        Scanner input = new Scanner(System.in);
        
        int i = input.nextInt();

            while (i < 0) {

                System.out.println("Número negativo não é válido...");
                i = input.nextInt();
            }

            System.out.println("Agora está correto!");
            System.out.println("E a raiz quadrada de " + i + " é " + (i * i));
        
            input.close();
    }

}