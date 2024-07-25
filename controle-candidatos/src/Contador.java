import java.util.Scanner;

// Classe de exceção personalizada
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            // Chamando o método que contém a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            // Imprime a mensagem de exceção
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        terminal.close(); // Fecha o scanner para evitar vazamento de recursos
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Valida se parametroUm é maior que parametroDois e lança uma exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("Parâmetros inválidos: o primeiro parâmetro é maior que o segundo.");
        }

        // Calcula a diferença
        int contagem = parametroDois - parametroUm;

        // Executa o loop for para imprimir os números com base na variável contagem
        for (int i = 0; i <= contagem; i++) {
            System.out.println("Imprimindo o número ["+ (parametroUm+i) +"]");
        }
    }
}
