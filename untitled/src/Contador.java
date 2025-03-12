// Importa a classe Scanner para ler entrada do usuário
import java.util.Scanner;

// Criação de uma classe de exceção personalizada para lidar com erros de parâmetros inválidos
class ParametrosInvalidosException extends Exception {
    // Construtor da exceção que recebe uma mensagem personalizada
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}

// Classe principal do programa
public class Contador {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para capturar entrada do usuário
        Scanner terminal = new Scanner(System.in);

        // Solicita ao usuário que digite o primeiro parâmetro
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt(); // Lê o primeiro número inteiro

        // Solicita ao usuário que digite o segundo parâmetro
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt(); // Lê o segundo número inteiro

        try {
            // Chama o método contar passando os dois parâmetros digitados
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Captura a exceção caso o primeiro parâmetro seja maior ou igual ao segundo
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Fecha o Scanner para evitar vazamento de recursos
        terminal.close();
    }

    // Método responsável por contar e imprimir os números conforme a lógica proposta
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Verifica se o primeiro parâmetro é maior ou igual ao segundo
        if (parametroUm >= parametroDois) {
            // Lança uma exceção informando que o segundo parâmetro deve ser maior
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Calcula a quantidade de iterações a serem feitas
        int contagem = parametroDois - parametroUm;

        // Estrutura de repetição para imprimir os números conforme a contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
