import java.util.Scanner;

/**
 * PROJETO: Localizador de IDs
 * OBJETIVO: Validar a existência de um dado em um array utilizando lógica booleana.
 */
public class LocalizadorDeIDs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Base de dados de IDs cadastrados
        int[] idsDoUsuarios = {10, 25, 40, 55, 70};
        int interacaoDoUsario;
        
        // Flag (Bandeira): Armazena o estado da busca (encontrado ou não)
        boolean verificadorDeIds = false;

        System.out.println("Digite seu id: ");
        interacaoDoUsario = scanner.nextInt();

        // Percorre a lista de IDs
        for(int i = 0; i < idsDoUsuarios.length; i++){
            // Se encontrar o ID, o "interruptor" vira true
            if(idsDoUsuarios[i] == interacaoDoUsario){
                verificadorDeIds = true;
                // Dica técnica: aqui poderia ser usado um 'break' para otimizar
            }
        }

        // Verifica o estado da flag após o término da busca
        if(verificadorDeIds){
            System.out.println("Seu id está cadastrado !!!");
        } else {
            System.out.println("Id não encontrado !!!");
        }

        scanner.close();
    }
}
