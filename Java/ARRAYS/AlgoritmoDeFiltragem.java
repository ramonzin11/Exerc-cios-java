import java.util.Scanner;
public class AlgoritmoDeFiltragem{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notasDosAluno = new double[5];

        for(int i = 0; i < notasDosAluno.length; i++){
            System.out.println("DIGITE A " + (i + 1) + " NOTA: ");
            notasDosAluno[i] = scanner.nextDouble();
        }

        System.out.println("NOTAS ACIMA/IGUAL A 7.00");
        for(int i = 0; i < notasDosAluno.length; i++){
            if(notasDosAluno[i] >= 7.00){
                System.out.println(notasDosAluno[i]);
            }
        }

        scanner.close();
    }
}