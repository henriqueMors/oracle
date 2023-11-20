package programa;

import java.util.Scanner;

public class lendoArquivo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, soma, sub, mult, div;
        num1 = input.nextDouble();
        num2 = input.nextDouble();

        soma = num1 + num2;
        sub = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;

        System.out.println("A soma entre os dois números é de: " + soma);
        System.out.println("A subtracao entre os dois números é de: " + sub);
        System.out.println("A multiplicacao entre os dois números é de: " + mult);
        System.out.println("A soma entre os dois números é de: " + div);

        input.close();
    }
}
