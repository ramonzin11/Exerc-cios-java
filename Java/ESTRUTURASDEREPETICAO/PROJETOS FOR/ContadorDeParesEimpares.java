public class ContadorDeParesEimpares{
    public static void main(String[] args) {
        
        System.out.print("----------CONTADOR DE PAR OU IMPAR--------");

        for(int i = 1; i <= 100 ;i++){
            if(i % 2 == 0){
                System.out.println(i + " par");
                
            }else{
                System.out.println(i + " Impar");
        
            }
        }
    }
}
