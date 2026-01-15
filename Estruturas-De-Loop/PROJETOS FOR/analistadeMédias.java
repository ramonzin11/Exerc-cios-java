import java.util.Scanner;

public class analistadeMédias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== ANALISTA DE MÉDIAS ESCOLARES =======");

        // Variável acumuladora: ela começa em 0 e vai "guardando" a soma de cada nota.
        double somaDasNotas = 0;
        double somaDasMedias;

        // Laço de repetição para processar 5 alunos.
        // Note: aqui o 'i' controla apenas a quantidade de voltas, pois não há vetor.
        for(int i = 1; i <= 5; i++){
            System.out.print("Insira a nota do aluno " + i + " :");
            
            // Lemos a nota atual. Como não há vetor, esta variável é sobrescrita a cada volta.
            double notasDosAluno = scanner.nextDouble(); 

            // Somamos a nota digitada ao total acumulado.
            somaDasNotas += notasDosAluno;
        }

        // Cálculo da média aritmética simples.
        somaDasMedias = somaDasNotas / 5;
        
        System.out.println("===================================");
        System.out.println("A média da turma é : " + somaDasMedias);

        scanner.close();
    }
}