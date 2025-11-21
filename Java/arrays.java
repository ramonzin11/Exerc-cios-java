public class arrays{
    public static void main(String[] args) {
        
        //? Criando o array e iniciando com as notas 
        double[] notas = {7.5, 9.0, 6.5, 8.0, 5.0};

        //? Criando a variavel que vai receber a soma de todas as notas 
        double somatotal = 0;

        System.out.println("=-=-=-=- Somando todas as notas =-=-=-=-");

        //? Nesse loop vai realizar a soma da notas.
        for(int i = 0; i < notas.length; i++){
            somatotal = somatotal + notas[i];
            
        }

        //? Aqui vai mostrar o total de todas as notas somadas 
        System.out.println("A soma total de todas as notas : " + somatotal);
    }
}