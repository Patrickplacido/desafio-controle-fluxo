import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner terminal = new Scanner(System.in);
        try {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();

            contar(parametroUm, parametroDois);

        } catch (InputMismatchException e) {
            System.err.println("Os argumentos fornecidos devem ser números inteiros válidos.");
        } catch (ParametrosInvalidosException e) {
            System.err.println("Erro: O segundo parâmetro deve ser maior que o primeiro.");
        }


    }
    static void contar(int num1, int num2) throws ParametrosInvalidosException{
        if (num2 < num1)
            throw new ParametrosInvalidosException();

        int iteracoes = num2 - num1;
        for (int i = 1; i <= iteracoes; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}