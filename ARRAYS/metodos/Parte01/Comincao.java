public class Comincao {

    public static void main(String[] args) {
    
        saudacao("Ramon");
        saudacao("Maria");
        saudacao("João");
    }                                    // ← main fecha aqui

    public static void saudacao(String nome) {   // ← método começa aqui, fora do main
        System.out.println("Olá, " + nome + "!");
    }

}