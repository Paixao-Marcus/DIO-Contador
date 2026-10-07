import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();


        try {
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
        }
//Preferi imprmir o intervalo entre os numeros inves de imprimir somente os valores de 1 até o paramentro2
    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        int conta = parametroUm;
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
        }
        int contagem = parametroDois;
       for(int i = conta; i < contagem; i++){
           System.out.println("Imprimindo o numero "+i);
       }
    }
}

