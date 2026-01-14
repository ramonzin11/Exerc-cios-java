
import java.util.Scanner;
public class classificadordeTriângulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=-=-=-=-=- Classificador de Triângulos =-=-=-=-=-=-=- ");
        
        //?NESSE BLOCO EU ESTOU DECLARANDO AS VARIAVEIS E PEDINDO PARA O USUARIO DIGITAR O VALOR DOS LADOS DO TRIÂNGULO 
        System.out.print("Digite o valor do lado 1: ");
        double lado1 = scanner.nextDouble();

        
        System.out.print("Digite o valor do lado 2 : ");
        double lado2 = scanner.nextDouble();
       

        System.out.print("Digite o valor do lado 3: ");
        double lado3 = scanner.nextDouble();
        

        //? BLOCO VAMOS VERIFICAR SE TEM COMO FORMAR UM TRIÂNGULO COM OS DADOS INSERIDOS, E SE TIVER COMO, QUAL TIPO DE TRIÂNGULO.

        //! Não é um triângulo se a soma de dois lados for menor que o terceiro.
       if( (lado1 + lado2) <= lado3 || (lado3 + lado1) <= lado2 || (lado3 + lado2) <= lado1){
            System.out.print("Não é um triângulo");

        //! Equilátero se todos os lados forem iguais.
        }else if(lado1 == lado2 && lado2 == lado3){
            System.out.print("Triângulo Equilátero");

        //! Isósceles se apenas dois lados forem iguais.
        }else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
            System.out.print("Triângulo Isósceles.");
            
        //! Escaleno se todos os lados forem diferentes.
        }else{
            System.out.print("Triângulo Escaleno.");
        }

        scanner.close();
    }    
}
