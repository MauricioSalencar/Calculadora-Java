package func;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ValidandoEntradaValor {
        
    public static double validandoEntradaValor(String numero){

        Double valor1 = 0.0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
           try {

                System.out.print("Digite o " +  numero + " valor: ");
                valor1 = scanner.nextDouble();

                break; // sai do loop se der certo

            } catch (InputMismatchException e) {

                System.out.println("Você digitou algo inválido!");
                    scanner.nextLine(); // limpa entrada errada
            }
        }
        return valor1;
    }
}
