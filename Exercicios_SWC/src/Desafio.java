import java.util.InputMismatchException;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um valor");
        while (scanner.hasNext()) {
            try {
                int valor = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Erro : "+e.getMessage());
                scanner.next(); // limpa o buffer de entrada
            }
        }
    }
}
