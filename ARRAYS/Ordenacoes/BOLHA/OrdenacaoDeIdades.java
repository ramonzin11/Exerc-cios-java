import java.util.Scanner;
public class OrdenacaoDeIdades {
    public static void main(String[] args) {
        int[] idade = new int[5];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < idade.length; i++){
            System.out.print("Digite a " + (i + 1) + "° idade: ");
            idade[i] = scanner.nextInt();
        }

        for(int i = 0; i < idade.length; i++){
            for(int j = 0; j < idade.length - 1; j++){
                if(idade[j] > idade[j + 1]){
                    int variavel = idade[j];
                    idade[j] = idade[j + 1];
                    idade[j + 1] = variavel;
                }
            }
        }

        for(int i : idade){
            System.out.println(i);
        }

        scanner.close();
    }
}