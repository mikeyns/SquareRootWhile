 import java.util.Scanner;

public class SquareRootWhile {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        int number;

        // Loop while que solicita um número até que um número negativo seja digitado
        while (true) {
            System.out.print("Digite um número inteiro não negativo (ou um número negativo para sair): ");
            number = console.nextInt();
            
            // Verifica se o número é negativo para sair do loop
            if (number < 0) {
                break;
            }
        }
    }
}