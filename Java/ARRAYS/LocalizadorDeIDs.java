import java.util.Scanner;
public class LocalizadorDeIDs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] idsDoUsuarios = {10, 25, 40, 55, 70};
        int interacaoDoUsario;
        boolean verificadorDeIds = false;
       

        System.out.println("Digite seu id: ");
        interacaoDoUsario = scanner.nextInt();

        for(int i = 0; i < idsDoUsuarios.length; i++){
            if(idsDoUsuarios[i] == interacaoDoUsario){
                verificadorDeIds = true;
            }
        }

        if(verificadorDeIds){
            System.out.println("Seu id está cadastrado !!!");
        }else{
            System.out.println("Id não encotrado !!!");
        }

        scanner.close();

    }
}
