import java.util.Scanner;
public class filtroDeNotas {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double[] vetorDasnotas = new double[5];
        double mediaDaturma = 0;
        double resultadoFinal;

        System.out.println("BEM-VINDO AO FILTRO DE NOTAS");
       
        for(int i = 0; i < vetorDasnotas.length; i++){
            System.out.print("Digite a nota " + (i + 1) + ": ");
            vetorDasnotas[i] = scanner.nextDouble();

            mediaDaturma = (mediaDaturma + vetorDasnotas[i]);

        }

        resultadoFinal = mediaDaturma / 5;

        System.out.println("\n===== NOTAS ACIMA DA MÉDIA ====== ");

        for(int i = 0; i < vetorDasnotas.length; i++){
            if(vetorDasnotas[i] > resultadoFinal){
                System.out.println("A nota " + (i + 1) + " : " + vetorDasnotas[i]);
            }
        }

        System.out.println("\n==================================");
        System.out.println("MÉDIA DA TURMA: " + resultadoFinal);
      
        scanner.close();
    }
}
