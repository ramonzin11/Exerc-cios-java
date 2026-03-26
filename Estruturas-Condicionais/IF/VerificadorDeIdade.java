import java.util.Scanner;
public class VerificadorDeIdade  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Verificador de Idade");
        System.out.println("Qual é a sua Idade: ");
        int idadeDoUsuario = scanner.nextInt();

        if(idadeDoUsuario <= 13){
            System.out.println("Você é criança !!!");
        }else if(idadeDoUsuario >= 14 && idadeDoUsuario <= 17){
            System.out.println("Você é Adolescente !!! ");
        }else if(idadeDoUsuario >= 18 && idadeDoUsuario <= 60){
            System.out.println("Você é Adulto");
        }else{
            System.out.println("Você é idoso!!!");
        }

        scanner.close();
    }
}
