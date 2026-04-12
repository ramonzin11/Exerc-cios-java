import java.util.Scanner;
public class CadastroDeAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] alunos = new double[3][3];

        for(int i = 0; i < alunos.length; i++){
            for(int j = 0; j < alunos[i].length; j++){
                System.out.print("Nota do aluno " + (i + 1) + " - prova " + (j + 1) + ": ");
                alunos[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("\n--- Notas Cadastradas ---");
        for(int i = 0; i < alunos.length; i++){
            System.out.print("Aluno " + (i + 1) + ": ");
            for(int j = 0; j < alunos[i].length; j++){
                System.out.print(alunos[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}