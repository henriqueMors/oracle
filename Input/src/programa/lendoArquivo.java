package programa;

import java.util.Scanner;

public class lendoArquivo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(
            Input04.class.getResourceAsStream(fakeFile.txt));

        input.close();
    }
}
