public class Administrador extends Funcionario implements Autenticavel{

    private int senha;
    public Administrador(String nome, String cpf, double salario, int senha){
        super(nome, cpf, salario);
        this.senha = senha;
    }

    @Override
    public double getBonificacao() {
        return 0;
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
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
