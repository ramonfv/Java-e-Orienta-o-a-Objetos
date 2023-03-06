public class Gestor extends Funcionario{

    private int senha;

    public Gestor(String nome, String cpf, double salario, int senha) {
        super(nome, cpf, salario);
        this.senha = senha;
    }


    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }

    public double getBonificacao() {
        return super.getBonificacao() + super.getSalario();
    }
}
