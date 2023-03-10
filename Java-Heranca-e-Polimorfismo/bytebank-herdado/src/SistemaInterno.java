public class SistemaInterno {

    private int senha = 2222;
    public void autentica(FuncionarioAutenticavel tipo){
        boolean autenticou = tipo.autentica(this.senha);
        if(autenticou == true){
            System.out.println("Permissão concedida ao sistema");
        } else {
            System.out.println("Verificar sua senha ou você não tem permissão para acessar o sistema");

        }



    }
}
