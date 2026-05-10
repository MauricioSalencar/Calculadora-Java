import java.util.InputMismatchException;
import java.util.Scanner;
import func.Fechar;
import func.LimparTela;
import func.Calculo;
import func.ValidandoEntradaOperacao;
import func.ValidandoEntradaValor;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Double valor1 = 0.0;
        Double valor2 = 0.0;
        String operacao;
        boolean continuar = true;


        LimparTela.limparTela();

        System.out.print("-------------------Calculadora Simples-------------------\n");

        while(continuar){

            //recebendo o valor1 e validando a entrada
            valor1 = ValidandoEntradaValor.validandoEntradaValor("primeiro");

            //recebendo a operação e validando a entrada
            operacao = ValidandoEntradaOperacao.validandoEntradaOperacao();

            //recebendo o valor 2
            valor2 = ValidandoEntradaValor.validandoEntradaValor("segundo");
            


            //escrevendo a resposta
            System.out.println("a reposta é :" + Calculo.calculo(valor1, valor2, operacao) + "\n-----------------------------------\n");
            //System.out.println(valor1+" " +valor2+ " "+ operacao);


            //verificando se quer continuar
            System.out.println("Você quer realizar outra operação? (Sim ou Nao)");
            String fechar = scanner.next();
            continuar = Fechar.fechar(fechar);
            LimparTela.limparTela();

        }
    }
 
}
