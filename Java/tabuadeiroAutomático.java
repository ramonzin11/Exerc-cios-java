import java.util.Scanner;

public class tabuadeiroAutomático {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("=-=-=-= TABUADEIRO JAVA =-=-=-=-=");

        System.out.println("\n==================================");
        System.out.print("\nO valor de qual tabuada você deseja saber: ");
        
        // Captura o número base que será multiplicado.
        int multiplicador = scanner.nextInt();

        // LAÇO DE REPETIÇÃO: Definido para rodar 10 vezes.
        // O 'i' começa em 1 e vai até 10, servindo como o contador da tabuada.
        for(int i = 1; i <= 10; i++){
            // Cálculo lógico: a cada volta, multiplicamos o contador pelo número escolhido.
            int resultado = i * multiplicador;
            
            // Exibição formatada para o usuário (ex: 1 X 5 = 5).
            System.out.println(i + " X " + multiplicador + " = " + resultado);
        }

        scanner.close(); // Encerra a leitura do teclado.
    }
}
