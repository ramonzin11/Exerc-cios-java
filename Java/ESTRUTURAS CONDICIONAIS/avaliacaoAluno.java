//* Avaliação do aluno 
import java.util.Scanner;

public class avaliacaoAluno {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //? Pedindo para o usuario inserir as notas e a frequência do aluno
        System.out.print("Digite a primeira nota : ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota : ");
        double nota2 = scanner.nextDouble();

        System.out.print("digite a terceira nota : ");
        double nota3 = scanner.nextDouble();

        System.out.print("Qual foi a frequência do aluno : ");
        int frenquenciaDoAluno = scanner.nextInt();

        //? Essa variavel vai armazenar a media do aluno
        double resultadoDamedia = (nota1 + nota2 + nota3) / 3;

        //? Essa estrutura vai verificar se o aluno foi Aprovando ou reprovado.
        if(7.0 <= resultadoDamedia && 75 <= frenquenciaDoAluno){
            String statusFinal = "Parabéns aprovado";
            System.out.println("O estudante foi Aprovado ou Reprovado: " + statusFinal);
        }else{ 
            String statusFinal = "Infelizmente reporvado";
            System.out.println("O estudande foi aprovado ou Reprovado : " + statusFinal);
        };
        
        //? Aqui vai printar a média e a frequêcia do aluno. 
        System.out.println("Sua média foi: " + resultadoDamedia + " e sua frequência foi: " + frenquenciaDoAluno);

        scanner.close();

    }
}
