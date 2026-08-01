import java.util.Scanner;
public class ValidadorDeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade; 

        System.out.println("Informe sua idade: ");
        idade = scanner.nextInt();

        System.out.println(verificarIdade(idade));

        scanner.close();

    }

    public static String verificarIdade(int idade){
        if(idade >= 0 && idade <= 12){
          return "Criança";
        }else if(idade >= 13 && idade <= 17){
            return "Adolescente";
        }else if(idade >= 18 && idade <=59){
            return "Adulto";
        }else if(idade >= 60){
           return "Idoso";
        }else{
            return "Idade inválida";
        }
    }
}
