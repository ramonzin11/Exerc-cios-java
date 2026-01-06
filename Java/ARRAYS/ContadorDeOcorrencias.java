import java.util.Scanner;
public class ContadorDeOcorrencias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ocorrencias = {12,7,4,6,7,7,6,5,4,3};
        int numerosDeOcorrencias = 0;
        int interacao;

        System.out.print("Qual é o id da sua ocorrência: ");
        interacao = scanner.nextInt();

        for(int i = 0; i < ocorrencias.length; i++){
            if(ocorrencias[i] == interacao){
                numerosDeOcorrencias++;
            }
        }

        System.out.print("A ocorrência do id: " + interacao + " aparence " + numerosDeOcorrencias + " vezes em nosso sistema");

        scanner.close();
    }
}
