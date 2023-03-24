import java.math.BigDecimal;

public class TestaContaComExcecaoChecked {

    public static void main(String[] args) {
        Conta conta1 = new Conta();
        try {
            conta1.deposita();
        } catch (MinhaExcecao ex){
            System.out.println("Tratamento ...");
        }


    }
}
