public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(12587, 223698);
        conta.setNumero(1337);

        Cliente jade = new Cliente();
        conta.setTitular(jade);

        jade.setNome("Jade do pai dela");
        System.out.println("O nome do titular da conta é " + conta.getTitular().getNome());
        conta.getTitular().setProfissao("Herdeira");
        System.out.println("Qual a profissão do cliente " + conta.getTitular().getNome() +
                            "? " + conta.getTitular().getProfissao());
    }
}
