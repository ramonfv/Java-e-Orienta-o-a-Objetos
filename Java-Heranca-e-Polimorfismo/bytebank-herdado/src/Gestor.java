public class Gestor extends Funcionario implements Autenticavel{

    private int senha;

    public Gestor(String nome, String cpf, double salario, int senha) {
        super(nome, cpf, salario);
        this.senha = senha;
    }

    public double getBonificacao() {

        return super.getSalario();
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getSenha() {
        return senha;
    }

    @Override
    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Autenticação realizada com sucesso!");
            return true;

        }else {
            System.out.println("Senha incorreta.");
            return false;
        }
    }
}
