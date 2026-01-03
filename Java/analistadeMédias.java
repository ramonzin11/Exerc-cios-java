import java.util.Scanner;
public class analistadeMédias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== ANALISTA DE MÉDIAS ESCOLARE =======");

        double somaDasNotas = 0;
        double somaDasMedias;

        for(int i = 1; i <= 5; i++){
            System.out.print("Insira a nota do aluno " + i + " :");
            double notasDosAluno = scanner.nextInt();

            somaDasNotas += notasDosAluno;

        }

        somaDasMedias = somaDasNotas / 5;
        System.out.println("===================================");
        System.out.println("A média da turma é : " + somaDasMedias);

        scanner.close();
    }
}
