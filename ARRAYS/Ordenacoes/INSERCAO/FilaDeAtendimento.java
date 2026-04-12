import java.util.Scanner;
public class FilaDeAtendimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] senhas = new int[5];

        for(int i = 0; i < senhas.length; i++){
            System.out.print("Digite a senha " + (i + 1) + "°: ");
            senhas[i] = scanner.nextInt();
        }

        for(int i = 1; i < senhas.length; i++){
            int chave = senhas[i];
            int j = i - 1;
            while(j >= 0 && senhas[j] > chave){
                senhas[j + 1] = senhas[j];
                j--;
            }
            senhas[j + 1] = chave;
        }

        System.out.println("--- Ordem de Atendimento ---");
        for(int i = 0; i < senhas.length; i++){
            System.out.println((i + 1) + "° | Senha: " + senhas[i]);
        }
        scanner.close();
    }
}