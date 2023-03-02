public class TestaFuncionario {
    public static void main(String[] args) {

        Funcionario ramon = new Funcionario("Ramon Alves", "111.222.333-44", 9000.00);


        System.out.println("O nome do funcionário 1 é "+ ramon.getNome());
        System.out.println("Ele recebeu uma bonificação de R$ " + ramon.getBonificacao());


        Funcionario jade = new Funcionario("Jade Viana", "444.555.666.777-88", 15000.58);
        System.out.println("A bonificação da colaboradora " + jade.getNome() + " é R$ " + jade.getBonificacao());
    }
}
