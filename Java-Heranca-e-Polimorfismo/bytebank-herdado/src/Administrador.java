public class Administrador extends FuncionarioAutenticavel{

    private int senha;
    public Administrador(String nome, String cpf, double salario, int senha){
        super(nome, cpf, salario, senha);
        this.senha = senha;
    }

    @Override
    public double getBonificacao() {
        return 0;
    }

//    public void setSenha(int senha) {
//        this.senha = senha;
//    }

//    public boolean autentica(int senha) {
//        if (this.senha == senha) {
//            System.out.println("Autenticação realizada com sucesso!");
//
//            return true;
//        } else {
//            System.out.println("Senha incorreta.");
//            return false;
//        }
//    }
}
