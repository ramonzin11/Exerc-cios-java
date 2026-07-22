import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        int escolhaDoUsuario;

        System.out.print("Digite o primeiro valor: ");
        num1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        num2 = scanner.nextDouble();

       System.out.println("\nMENU PRINCIPAL");
       System.out.println("1. SOMAR\n2. SUBTRAIR\n3. MULTIPLICAR\n4. DIVIDIR");
       System.out.print("VOCÊ DESEJA FAZER QUAL TIPO DE OPERAÇÃO: ");
       escolhaDoUsuario = scanner.nextInt();

       switch (escolhaDoUsuario) {
        case 1:
            System.out.println("A soma entre " + num1 + " + " + num2 + " = " + somar(num1, num2));
            break;
        case 2:
            System.out.println("A subtração entre " + num1 + " - " + num2 + " = " + subtrair(num1, num2));
            break;
        case 3:
            System.out.println("A multiplicação entre " + num1 + " * " + num2 + " = " + multiplicar(num1, num2));
            break;
        case 4:
            System.out.println("A divição entre " + num1 + " / " + num2 + " = " + dividir(num1, num2));
            break;
       
        default:
            System.out.println("Opção invalida");
            break;
       }

       scanner.close();

    }

    public static double somar(double num1, double num2){ 
        return num1 + num2;
    }

    public static double subtrair(double num1, double num2){
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2){
        return num1 * num2;
    }

    public static double dividir(double num1, double num2){
        if(num2 == 0.0) {
            System.out.println("Não é possível dividir por zero!");
            return 0;
        }

        return num1 / num2;
    }
}
