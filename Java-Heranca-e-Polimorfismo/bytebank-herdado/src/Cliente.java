public class Cliente implements Autenticavel{

    private int senha ;
    private String nome;
    private String identificador;

    private AutenticacaoCompartilhada autentiucador;

    public Cliente(){
        this.autentiucador = new AutenticacaoCompartilhada();
    }
    public Cliente(String nome, String identificador, int senha) {
        this.nome = nome;
        this.identificador = identificador;
        this.senha = senha;
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



