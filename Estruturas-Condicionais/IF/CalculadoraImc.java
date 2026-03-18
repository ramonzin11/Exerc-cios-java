import java.util.Scanner;
 
public class CalculadoraImc {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Peso (kg): ");
        double peso = scanner.nextDouble();
        
        System.out.print("Altura (em metros, ex: 1.79): ");
        double altura = scanner.nextDouble();
 
        double imc = peso / (altura * altura);
 
        if(imc <= 18.5){
            System.out.println("Abaixo do peso");
        } else if(imc > 18.5 &&  imc <= 24.9){
            System.out.println("Peso normal");
        } else {
            System.out.println("Sobrepeso/Obesidade");  
        }
 
        System.out.printf("IMC: %.2f%n", imc);

        scanner.close();
    }
}

