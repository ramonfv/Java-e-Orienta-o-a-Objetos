public class Gestor extends Funcionario implements Autenticavel{

    private AutenticacaoCompartilhada autentiucador;


    public Gestor(String nome, String cpf, double salario, int senha) {
        super(nome, cpf, salario, senha);
        this.autentiucador = new AutenticacaoCompartilhada();
    }

    public double getBonificacao() {

        return super.getSalario();
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
