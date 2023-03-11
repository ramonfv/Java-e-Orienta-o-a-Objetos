public class Administrador extends Funcionario implements Autenticavel{

    private AutenticacaoCompartilhada autentiucador;

    public Administrador(String nome, String cpf, double salario, int senha){
        super(nome, cpf, salario, senha);
        this.autentiucador = new AutenticacaoCompartilhada();
    }

    @Override
    public double getBonificacao() {
        return 0;
    }


    @Override
    public void setSenha(int senha) {

        this.autentiucador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autentiucador.autentica(senha);
    }

}
