public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 256968);

//        Conta inconsistente
//        conta.setAgencia(-50);

        Conta contaBancariaDaJde = new Conta(2588, 66987);

//
        System.out.println(Conta.getNumeroDeContas());
    }
}
