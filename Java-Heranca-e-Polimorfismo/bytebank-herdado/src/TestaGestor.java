public class TestaGestor {
    public static void main(String[] args) {
        Gestor gerente = new Gestor("Ramon Troller", "111.666.999.85", 2300.96, 1234);


        System.out.println("O nome do gerente é " + gerente.getNome());
        System.out.println(gerente.getBonificacao());

        boolean autentica = gerente.autentica(gerente.getSenha());
        System.out.println(autentica);

    }
}
