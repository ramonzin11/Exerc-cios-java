import java.util.Scanner;
public class ControleDeEstoque {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       int[] quantidadeAtual = new int[4];
       String[] nomeDosProdutos = new String[4];

       for(int i = 0; i < quantidadeAtual.length; i++){
           

            System.out.print("Digite o nome do " + (i + 1) + "° produto: ");
            nomeDosProdutos[i] = scanner.nextLine();

            System.out.print("Digite a quantidade atual do produto: ");
            quantidadeAtual[i] = scanner.nextInt();
            scanner.nextLine();
        }

        for(int j = 0; j < quantidadeAtual.length; j++){
            if(quantidadeAtual[j] <10){
                System.out.println("O produto: " + nomeDosProdutos[j] + " | quantidade: " + quantidadeAtual[j] + "\n | ATENÇÃO ESSE PRODUTO ESTÁ COM O ESTOQUE ABIXO DO PERMITIDO (ESTOQUE PERMITIDO: 10) ");
            }
        }

        scanner.close();
    }
}
