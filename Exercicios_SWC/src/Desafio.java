import java.util.InputMismatchException;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um valor : ");
        while (scanner.hasNext()) {
            try {
                int valor = scanner.nextInt();
                if (valor!=0){
                System.out.println("Conversão de dados concluida");
                    System.out.print("Insira um valor : ");
                }else{
                    System.out.println("Encerrando aplicação");
                    System.exit(0);
                }
            } catch (InputMismatchException e) {
                System.out.printf("Erro na conversão: " + e + "%n");
                System.out.print("Insira um valor : ");
                scanner.next(); // limpa o buffer de entrada
            }catch (Exception e){
                System.out.println("Encerrando aplicação");
            }
        }
    }
}
