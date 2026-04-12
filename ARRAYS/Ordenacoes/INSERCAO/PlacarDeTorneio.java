import java.util.Scanner;
public class PlacarDeTorneio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] pontos = new int[5];

        for(int i = 0; i < pontos.length; i++){
            System.out.print("Digite a pontuação do " + (i + 1) + "° jogador: ");
            pontos[i] = scanner.nextInt();
        }

        for(int i = 1; i < pontos.length; i++){
            int chave = pontos[i];
            int j = i - 1;
            while(j >= 0 && pontos[j] < chave){
                pontos[j + 1] = pontos[j];
                j--;
            }
            pontos[j + 1] = chave;
        }

        System.out.println("--- Placar Final do Torneio ---");
        for(int i = 0; i < pontos.length; i++){
            System.out.println((i + 1) + "° lugar | " + pontos[i] + " pontos");
        }
        scanner.close();
    }
}