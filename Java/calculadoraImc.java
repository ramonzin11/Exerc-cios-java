//*Calculadora de IMC!
import java.util.Scanner;
public class calculadoraImc{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------- Descubra seu IMC --------");

        //? Pedindo para o usuário inserir o peso e a sua altura.
        System.out.print("Qual é o seu peso: ");
        double pesodoUsuario = scanner.nextDouble();

        System.out.print("Qual é a sua altura : ");
        double alturaUsuario = scanner.nextDouble();

         //? Aqui vai acontecer o calculo do IMC do usuário
        double valorDoImc = pesodoUsuario / (alturaUsuario * alturaUsuario);

        //? A forma condicional que vai verificar se o usuário está com o peso baixo,normal ou alto.
        if(valorDoImc < 18.5 ){
            System.out.println("Abaixo do peso");
        }else if(valorDoImc <= 24.9){
            System.out.println("Peso normal");
        }else{
            System.out.println("Sobrepeso/Obesidade");
        }

        //? mostrando o IMC ja com o formato de dois números depois da virgula.
        System.out.printf("Seu IMC é : %.2f\n", valorDoImc);
        
        scanner.close(); //? Fechando o scanner.
    }
    
}