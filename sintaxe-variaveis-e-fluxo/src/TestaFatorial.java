public class TestaFatorial {
    public static void main(String[] args) {
        int numero = 10;
        int fatorial = 1;
        for(int i = 1; i <= numero; i++){
            fatorial *= i;
            System.out.println("O número fatorial de " + i + " é " + fatorial );
        }
    }
}
