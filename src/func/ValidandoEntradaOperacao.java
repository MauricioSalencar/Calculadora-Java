package func;
import java.util.Scanner;

public class ValidandoEntradaOperacao {
    public static String validandoEntradaOperacao(){
        boolean continuar = true;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a operação (+, -, *, /): ");
        String operacao = scanner.next();

        while (continuar){
            if (operacao.equals("+") || operacao.equals("-") || operacao.equals("*") || operacao.equals("/")){
                continuar = false;

            } else {
                System.out.println("operacao invalida, tente novamente uma das operações: +, -, *, /");
                operacao = scanner.next();

            }
        }
        return operacao;
    }
}
