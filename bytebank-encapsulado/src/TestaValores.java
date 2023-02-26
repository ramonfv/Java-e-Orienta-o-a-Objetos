public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1337, 256968);

//        Conta inconsistente
        conta.setAgencia(-50);

//
        System.out.println(conta.getAgencia());
    }
}
