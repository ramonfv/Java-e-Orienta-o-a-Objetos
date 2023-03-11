public class Cliente implements Autenticavel{

    private int senha;
    private String nome;
    private String identificador;

    public Cliente(String nome, String identificador, int senha) {
        this.nome = nome;
        this.identificador = identificador;
        this.senha = senha;
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
