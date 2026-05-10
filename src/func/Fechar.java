package func;

import java.util.Scanner;

public class Fechar {
    public static boolean fechar(String resposta){
        boolean continuar = true;
        boolean conclusao = false;

        Scanner scanner = new Scanner(System.in);

        while(continuar){
            if (resposta.equalsIgnoreCase("sim")){
                    conclusao = true;
                    continuar = false;
                } else if (resposta.equalsIgnoreCase("nao")){      
                    conclusao = false;          
                    continuar = false;
                } else {
                    System.out.println("resposta invalida, tente novamente");
                    resposta = scanner.next();
                }
        }
        return conclusao; 

    }
}
