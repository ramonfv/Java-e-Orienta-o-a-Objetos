public class TesteSistema {
    public static void main(String[] args) {
        Gestor diretor = new Gestor("Cachan Viana", "555.999.357-22", 3699, 222);
        Administrador geral = new Administrador("Lucas Loppes", "222.887.963.99", 6852.69, 2222);
        Gestor gerente = new Gestor("Ramon Troller", "111.666.999.85", 2300.96, 1234);
        Cliente pessoaFisica = new Cliente("Tarson Lima", "258.963.741.88", 2222);

        SistemaInterno validacao = new SistemaInterno();
        validacao.autentica(diretor);
        validacao.autentica(geral);
        validacao.autentica(gerente);
        validacao.autentica(pessoaFisica);

    }
}
