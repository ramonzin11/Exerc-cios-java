/**
 * PROJETO: Filtro de Classificação Etária
 * OBJETIVO: Demonstrar a filtragem seletiva de elementos em um vetor.
 */
public class FiltroDeMaioresDeIdade {
    public static void main(String[] args) {
        
        // Base de dados inicial com idades variadas
        int[] idades = {18, 12, 29, 11, 19, 59, 16, 11};
    
        System.out.println("IDADES MAIORES QUE 18 ANOS");

        // Loop de processamento para o primeiro critério (Maior ou igual a 18)
        for(int i = 0; i < idades.length; i++){
            if(idades[i] >= 18){
                System.out.println(idades[i]);
            }
        }

        System.out.println("IDADES MENORES QUE 18 ANOS");

        // Loop de processamento para o segundo critério (Menor que 18)
        for(int i = 0; i < idades.length; i++){
            if(idades[i] < 18){
                System.out.println(idades[i]);
            }
        }
    }
}