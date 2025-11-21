//*Simulação de Calculadora 
import java.util.Scanner;

public class calculadora{
   public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("=-=-=-=-=- Calculadora simples =-=-=-=-=-=-");

    //? Pedindo para o usuario Adicionar o valor1, valor2 e o operador da soma.
    System.out.print("Digite o primeiro valor : ");
    double num1 = scanner.nextDouble();

    System.out.print("Digite o segundo valor : ");
    double num2 = scanner.nextDouble();

    System.out.println("Digite o operador (+, -, * ou / ) ");
    String operadorStr = scanner.next();

    //? Garantindo que a variavel receba apenas a primeiro str inserida pelo usuario
    char operador = operadorStr.charAt(0);

    //? Declarando que o resultado comece com o valor 0
    double resultado = 0.0;

    //? Aqui vai acontecer a operação. 
    switch (operador) {
        case '+':
            resultado = num1 + num2;
            System.out.println("O Resultado : " + resultado);
            break;
        case '-':
            resultado = num1 - num2;
            System.out.println("O Resultado : " + resultado);
            break;
        case '/':
            resultado = num1 / num2;
            System.out.println("O Resultado : " + resultado);
            break;
        case '*':
            resultado = num1 * num2;
            System.out.println("O Resultado : " + resultado);
            break;        
    
        default:
            System.out.println("Operador invalido");
            break;
    }
   
    scanner.close();


   }   
}
