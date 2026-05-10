package func;

public class Calculo {
    public static Double calculo(Double valor1, Double valor2, String operacao){
        Double resultado = 0.0;
        switch(operacao){
           
            case "+":
                resultado = valor1 + valor2;
                break;
            case "-":
                resultado = valor1 - valor2;
                break;
            case"/":
                resultado = valor1 / valor2;
                break;
            case"*":
                resultado = valor1 * valor2;
                break;
            default:
                System.out.println("operacao invalida");
        }
        return resultado;
    }
}
