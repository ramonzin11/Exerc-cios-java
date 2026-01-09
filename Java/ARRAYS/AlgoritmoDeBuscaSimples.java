import java.util.Scanner;
public class AlgoritmoDeBuscaSimples {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int[] idsUsuarios = {10,12,11,16,54,25,7,9,5,3};
        int interacaoDoUsuario; 
        Boolean flagDoids = false;

        System.out.print("DIGITE O NÚMERO DO SEU ID: ");
        interacaoDoUsuario = scanner.nextInt();

        for(int i = 0; i < idsUsuarios.length; i++){
            if(idsUsuarios[i] == interacaoDoUsuario){
                flagDoids = true;
            }
        }

        if(flagDoids){
            System.out.println("SEU ID ESTÁ COM PENDÊNCIAS. ACESSO BLOQUEADO!!!");
        }else{
            System.out.println("ID SEM PENDÊNCIAS. ACESSO LIBERADO!!!");
        }


        scanner.close();

    }
}
