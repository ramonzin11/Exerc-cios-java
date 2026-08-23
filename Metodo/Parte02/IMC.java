import java.util.Scanner;
public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double peso;
        double altura;
         
        System.out.println("===== CALCULADOR DE IMC =====");

        System.out.print("Digite seu peso: ");
        peso = scanner.nextDouble();

        System.out.print("Digite sua altura: ");
        altura = scanner.nextDouble();

        System.out.printf("Seu IMC: %.2f%n", calcularIMC(peso, altura));

        classificarIMC(calcularIMC(peso, altura));

        scanner.close();
    
    }

    public static double calcularIMC(double peso, double altura){
        double imc = peso / (altura * altura);
        return imc;
    }

    public static void classificarIMC(double imc){
        if(imc < 18.5){
            System.out.println("Classificação : Abaixo do peso");
        }else if(imc >= 18.5 && imc <= 24.9){
            System.out.println("Classificação : Peso normal");
        }else if(imc >=25.0 && imc <= 29.9){
            System.out.println("Classificação : Sobrepeso");
        }else{
            System.out.println("Classificação : Obesidade");
        }
    }
}