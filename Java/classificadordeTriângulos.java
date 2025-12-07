    import java.util.Scanner;
public class classificadordeTriângulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=-=-=-=-=- Classificador de Triângulos =-=-=-=-=-=-=- ");
        
        System.out.print("Digite o valor do lado 1: ");
        double lado1 = scanner.nextDouble();

        
        System.out.print("Digite o valor do lado 2 : ");
        double lado2 = scanner.nextDouble();
       

        System.out.print("Digite o valor do lado 3: ");
        double lado3 = scanner.nextDouble();



       if( (lado1 + lado2) <= lado3 || (lado3 + lado1) <= lado2 || (lado3 + lado2) <= lado1){
            System.out.print("Não é um triângulo");
            
        }else if(lado1 == lado2 && lado2 == lado3){
            System.out.print("Triângulo Isósceles.");

        }else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
            System.out.print("Triângulo Isósceles.");

        }else{
            System.out.print("Triângulo Escaleno.");
        }

        scanner.close();
    }    
}
