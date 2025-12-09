import java.util.Scanner;

public class ValidacaoDeSenha {
    public static void main(String[] args) {

        //? Variáveis que armazenam as credenciais válidas e o estado do login.
        String usuarioValido = "RAMON NEVES";
        String senhaValida = "Java123";
        int tentativasUsuario = 0;
        boolean loginLiberado = false; //? Essa variável é a FLAG/Variável de Controle do loop.

        //? Inicializa o objeto Scanner para ler a entrada do usuário (teclado).
        Scanner scanner = new Scanner(System.in);

        System.out.println("=-=-=-=-=-=-=- Bem-vindo ao porteiro digital =-=-=-=-=-=-=");
        
        //? O loop roda ENQUANTO o usuário tiver MENOS de 3 tentativas E o login não for liberado.
        while (tentativasUsuario < 3 && !loginLiberado) { 
            
            //? Pede as credenciais ao usuário.
            System.out.print("USUARIO : ");
            String usuarioInserido = scanner.nextLine();

            System.out.print("SENHA: ");
            String senhaInserida = scanner.nextLine();
            
            //? Bloco de Decisão: Verifica se as credenciais estão corretas. 
            //? Usa .equals() para comparar Strings e && (E lógico) para combinar as condições.
            if (usuarioInserido.equals(usuarioValido) && senhaInserida.equals(senhaValida)) {
                loginLiberado = true; //? Se acertou, muda a flag para sair do loop.
            } else {
                tentativasUsuario++; //? Incrementa a tentativa se o login falhar.
                
                //? Fornece feedback, a menos que seja a última tentativa (que será tratada no 'if' final)
                if (tentativasUsuario < 3) {
                    System.out.println("Usuário ou senha incorretos. Você tem mais " + (3 - tentativasUsuario) + " tentativas.");
                } else {
                    System.out.println("Usuário ou senha incorretos.");
                }
            }

        } //? Fim do Loop

        //? Bloco Final de Decisão: O programa verifica o estado da flag de controle.
        if (loginLiberado) {
            System.out.println(" Acesso liberado para " + usuarioValido + " !");
        } else {
            System.out.println(" Acesso bloqueado! Tentativas esgotadas.");
        }

        //? Fecha o objeto Scanner para liberar recursos.
        scanner.close();
    }
}