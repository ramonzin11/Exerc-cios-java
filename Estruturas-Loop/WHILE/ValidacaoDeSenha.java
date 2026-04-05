import java.util.Scanner;

public class ValidacaoDeSenha {
    public static void main(String[] args) {
        String usuarioValido = "RAMON FARIA";
        String senhaValida = "Java123";
        int tentativasUsuario = 0;
        boolean loginLiberado = false;

        Scanner scanner = new Scanner(System.in);

        while (tentativasUsuario < 3 && !loginLiberado) { 
            System.out.print("USUARIO : ");
            String usuarioInserido = scanner.nextLine();

            System.out.print("SENHA: ");
            String senhaInserida = scanner.nextLine();
            
            if (usuarioInserido.equals(usuarioValido) && senhaInserida.equals(senhaValida)) {
                loginLiberado = true;
            } else {
                tentativasUsuario++;
                if (tentativasUsuario < 3) {
                    System.out.println("Incorreto. Você tem mais " + (3 - tentativasUsuario) + " tentativas.");
                } else {
                    System.out.println("Usuário ou senha incorretos.");
                }
            }
        }

        if (loginLiberado) {
            System.out.println("Acesso liberado para " + usuarioValido + "!");
        } else {
            System.out.println("Acesso bloqueado! Tentativas esgotadas.");
        }

        scanner.close();
    }
}