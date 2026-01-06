import java.util.Scanner;
public class SomatorioDeNotas{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double[] notasDosalunos = new double[5];
        double acumalhorDeNotas = 0;
        double maiorNota = 0;
      

        for(int i = 0; i < notasDosalunos.length; i++){
            System.out.print("Insira a nota do " + (i + 1) + " Aluno: ");
            notasDosalunos[i]  = scanner.nextDouble();

            acumalhorDeNotas += notasDosalunos[i];
        }

        double menorNota = notasDosalunos[0];

        for(int i = 0; i < notasDosalunos.length; i++){
            if(notasDosalunos[i] > maiorNota){
                maiorNota = notasDosalunos[i];
            }

            if(notasDosalunos[i] < menorNota){
                menorNota = notasDosalunos[i];
            }
        }

        System.out.println("==== RESUMO =====");

        System.out.println("A soma de todas as notas da sala: " + acumalhorDeNotas);
        System.out.println("A média da sala: " + (acumalhorDeNotas / notasDosalunos.length));
        System.out.println("A maior nota da turma foi: " + maiorNota);
        System.out.println("A menor nota da turma foi: " + menorNota);

        scanner.close();

    }
}