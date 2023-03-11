public class AutenticacaoCompartilhada {

    private int senha;


    public void setSenha(int senha) {
        this.senha = senha;
    }


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
