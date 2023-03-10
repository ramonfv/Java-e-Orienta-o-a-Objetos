public class TestaReferencia {
    public static void main(String[] args) {
        Gestor supervisor = new Gestor("Jade", "111.888.777-99", 3800.00, 3366);

        System.out.println(supervisor.getNome());
        supervisor.autentica(3366);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(supervisor);

        System.out.println(controle.getSoma());

    }
}
