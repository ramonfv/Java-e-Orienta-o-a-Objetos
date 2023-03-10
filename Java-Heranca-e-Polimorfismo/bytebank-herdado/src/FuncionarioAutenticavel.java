public abstract class FuncionarioAutenticavel extends Funcionario {

    private int senha;

    public FuncionarioAutenticavel(String nome, String cpf, double salario, int senha) {
        super(nome, cpf, salario);
        this.senha = senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Autenticação realizada com sucesso!");

            return true;
        } else {
            System.out.println("Senha incorreta.");
            return false;
        }
    }

}


