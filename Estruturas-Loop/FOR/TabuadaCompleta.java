import java.util.Scanner;
public class TabuadaCompleta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo a nossa Tabuada Eletronica");
        System.out.print("Digite o número que você deseja saber a tabuada de 1 a 10: ");
        int valor = scanner.nextInt();

        for(int i = 0; i < 10; i++){
            int mult =( i + 1) * valor;
            System.out.println((i + 1) + " X " + valor + " = " + mult);
        }

        scanner.close();
    }
}

