import java.util.Scanner;
public class SistemaCadastro {

    static int[] idDosAlunos = new int[12];
    static String[] nomeDosAlunos = new String[12];
    static String[] dataDeNascimentoAlunos = new String[12];
    static String[] sexoDoAluno = new String[12];
    static double[][] notasDosAlunos = new double[12][3];
    static Scanner scanner = new Scanner(System.in);

    static int totalDeAluno = 0; //? Esse é o contador — responsável por contabilizar cada vez que registro um aluno. Cada contagem tem um índice que começa no 0.

    public static void main(String[] args) {

        int interacaoDoUsuario; //? Responsável pela interação do usuário. Ele vai escolher um número de 1 a 5, e cada número tem uma interação com o sistema.
                                //? Trabalha junto com a flag (sairDoLoop) e o loop while.
        
        boolean sairDoLoop = false; //? Responsável pela estrutura do menu. Se for false, o menu continua rodando até o usuário escolher o número 5 (que muda para true e encerra o loop).

        while (!sairDoLoop) {
          System.out.println("\n ==== Bem vindo ==== ");
          System.out.println("1. Cadastrar aluno\n" + "2. Lançar notas\n" + "3. Ver resultado de um aluno\n" + "4. Listar todos os alunos\n" + "5. Sair");

          System.out.print("Qual opção você deseja executar ? ");
          interacaoDoUsuario = scanner.nextInt();

          switch (interacaoDoUsuario) { 
            case 1: //! Passamos o método cadastrarAluno com o contador totalDeAluno como parâmetro.
                cadastrarAluno(totalDeAluno);
                break;
            case 2: //! O usuário insere o ID do aluno. Usamos buscarIndicePorId para encontrar o índice. Se não encontrado, exibe erro. Se encontrado, chama lancarNota.
                System.out.print("Digite o ID do aluno: ");
                int id = scanner.nextInt();
                int indice = buscarIndicePorId(id);
                if(indice == -1){
                    System.out.println("Aluno não encontrado!");
                } else {
                    lancarNota(indice);
                }
                break;
            case 3: //! O usuário insere o ID do aluno. Usamos buscarIndicePorId para encontrar o índice. Se não encontrado, exibe erro. Se encontrado, chama exibirResultado.
                System.out.print("Digite o ID do aluno: ");
                    int id2 = scanner.nextInt();
                    int indice2 = buscarIndicePorId(id2);
                    if(indice2 == -1){
                    System.out.println("Aluno não encontrado!");
                    } else {
                        exibirResultado(indice2);
                    }
                    break;
            case 4: //! Mostra apenas o ID e o nome dos alunos cadastrados.
                for(int i = 0; i < nomeDosAlunos.length; i++){
                    if(nomeDosAlunos[i] != null){
                        System.out.println(idDosAlunos[i] +  " - " + nomeDosAlunos[i] );
                    }
                }
                break;
            case 5: //! Sai do loop e encerra o programa.
                sairDoLoop = true;
                break;
                
            default: //! Caso o usuário digite um número diferente de 1 a 5, exibe mensagem de erro.
                System.out.println("Opção inválida!!!");
                break;
            }
        }
    }

   public static void cadastrarAluno(int indice) { //! Pede as informações do aluno e verifica se o ID já está em uso antes de cadastrar.
        System.out.print("ID do aluno: ");
        int variavelDeVerificacao = scanner.nextInt();
        scanner.nextLine();
        int indice03 = buscarIndicePorId(variavelDeVerificacao);

        if(indice03 == -1){
            idDosAlunos[indice] = variavelDeVerificacao;
            System.out.print("Nome do aluno: ");
            nomeDosAlunos[indice] = scanner.nextLine();

            System.out.print("Data de Nascimento: ");
            dataDeNascimentoAlunos[indice] = scanner.nextLine();

            System.out.print("Sexo: ");
            sexoDoAluno[indice] = scanner.nextLine();

            totalDeAluno++;
            System.out.println("Aluno cadastrado com sucesso!");
        }else{
            System.out.println("\nEsse ID já está sendo utilizado por outro usuário.");
        }
    }

    public static void lancarNota(int indice){ //! Responsável por lançar as 3 notas do aluno.
        for(int i = 0; i < 3; i++){
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            notasDosAlunos[indice][i] = scanner.nextDouble();
        }
    }

    public static double calcularMedia(int indice){ //! Recebe as 3 notas, calcula a média e retorna o resultado.
        double somaDasNotas = 0;

        for(int i = 0; i < 3; i++){
            somaDasNotas += notasDosAlunos[indice][i];
        }

        return somaDasNotas / 3;
    }

    public static void exibirResultado(int indice){ //! Mostra se o aluno foi aprovado ou reprovado e exibe a média.
        double media = calcularMedia(indice);
        String situacao = media >= 6.0 ? "APROVADO" : "REPROVADO";
    
        System.out.println("Aluno: " + nomeDosAlunos[indice] + " | Matrícula: " + idDosAlunos[indice]);
        System.out.println("Média: " + media);
        System.out.println("Situação: " + situacao);
    }

    public static int buscarIndicePorId(int id){ //! Faz a busca do índice do aluno através do ID. Retorna o índice se encontrado, ou -1 se não encontrado.
        for(int i = 0; i < totalDeAluno; i++){
            if(idDosAlunos[i] == id){
                return i;
            }
        }
        return -1;
    }
}