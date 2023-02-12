public class TestaFor {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }
        for(int multiplicador = 1; multiplicador <= 10; multiplicador++){
            for(int contador = 0; contador <= 10; contador++){
                System.out.print(multiplicador * contador);
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int linha = 0; linha < 10; linha++){
            for(int coluna = 0; coluna <= linha; coluna++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int contador = 1; contador <= 100; contador++){
            if(contador % 3 == 0){
                System.out.println(contador);
            }
        }
    }
}
