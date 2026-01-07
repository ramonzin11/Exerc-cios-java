import java.util.Scanner;

/**
 * PROJETO: Somatório e Análise de Notas
 * OBJETIVO: Calcular soma, média, maior e menor valor de um conjunto de dados.
 */
public class SomatorioDeNotas {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Definição de um vetor com tamanho fixo (5 alunos)
        double[] notasDosalunos = new double[5];
        double acumalhorDeNotas = 0;
        double maiorNota = 0;
      
        // Primeiro laço: Entrada de dados e Acumulação
        for(int i = 0; i < notasDosalunos.length; i++){
            System.out.print("Insira a nota do " + (i + 1) + "º Aluno: ");
            notasDosalunos[i] = scanner.nextDouble();

            // Soma cada nota digitada ao total acumulado
            acumalhorDeNotas += notasDosalunos[i];
        }

        // Inicializa a menor nota com o primeiro elemento para uma comparação justa
        double menorNota = notasDosalunos[0];

        // Segundo laço: Busca por valores máximos e mínimos
        for(int i = 0; i < notasDosalunos.length; i++){
            // Lógica para encontrar a maior nota
            if(notasDosalunos[i] > maiorNota){
                maiorNota = notasDosalunos[i];
            }

            // Lógica para encontrar a menor nota
            if(notasDosalunos[i] < menorNota){
                menorNota = notasDosalunos[i];
            }
        }

        // Saída de dados: Relatório estatístico
        System.out.println("==== RESUMO =====");
        System.out.println("A soma de todas as notas da sala: " + acumalhorDeNotas);
        System.out.println("A média da sala: " + (acumalhorDeNotas / notasDosalunos.length));
        System.out.println("A maior nota da turma foi: " + maiorNota);
        System.out.println("A menor nota da turma foi: " + menorNota);

        scanner.close();
    }
}