import java.util.Scanner;

public class filtroDeNotas {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Definimos um vetor de 5 posições para guardar as notas.
        double[] vetorDasnotas = new double[5];
        // Variável acumuladora para guardar a soma de todas as notas.
        double mediaDaturma = 0;
        double resultadoFinal;

        System.out.println("BEM-VINDO AO FILTRO DE NOTAS");
       
        // PRIMEIRO LAÇO: Entrada de dados e Acumulação.
        for(int i = 0; i < vetorDasnotas.length; i++){
            System.out.print("Digite a nota " + (i + 1) + ": ");
            vetorDasnotas[i] = scanner.nextDouble();

            // Soma a nota atual com o que já foi acumulado anteriormente.
            mediaDaturma = (mediaDaturma + vetorDasnotas[i]);
        }

        // Cálculo da média fora do laço (Soma Total / Quantidade de itens).
        resultadoFinal = mediaDaturma / 5;

        System.out.println("\n===== NOTAS ACIMA DA MÉDIA ====== ");

        // SEGUNDO LAÇO: Varredura de Filtro.
        // Agora que já temos o 'resultadoFinal', percorremos o vetor de novo para comparar.
        for(int i = 0; i < vetorDasnotas.length; i++){
            // Se a nota da gaveta atual for maior que a média da turma:
            if(vetorDasnotas[i] > resultadoFinal){
                System.out.println("A nota " + (i + 1) + " : " + vetorDasnotas[i]);
            }
        }

        System.out.println("\n==================================");
        System.out.println("MÉDIA DA TURMA: " + resultadoFinal);
      
        scanner.close();
    }
}