
public class FiltroDeMaioresDeIdade{
    public static void main(String[] args) {
        
        int[] idades = {18,12,29,11,19,59,16,11};
    
        System.out.println("IDADES MAIORES QUE 18 ANOS");

        for(int i = 0; i < idades.length; i++){
            if(idades[i] >= 18){
                System.out.println(idades[i]);
            }
        }

        System.out.println("IDADES MENORES QUE 18 ANOS");

        for(int i = 0; i < idades.length; i++){
            if(idades[i] < 18){
                System.out.println(idades[i]);
            }
        }

    }
}