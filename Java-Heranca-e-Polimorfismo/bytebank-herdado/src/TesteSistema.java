public class TesteSistema {
    public static void main(String[] args) {
        Gestor diretor = new Gestor("Cachan Viana", "555.999.357-22", 3699, 222);
        Administrador geral = new Administrador("Lucas Loppes", "222.887.963.99", 6852.69, 2222);


        SistemaInterno validacao = new SistemaInterno();
        validacao.autentica(diretor);
        validacao.autentica(geral);

    }
}
