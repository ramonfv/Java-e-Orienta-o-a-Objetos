import java.math.BigDecimal;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaBancaria1 = new Conta();
        contaBancaria1.saldo = BigDecimal.valueOf(100);
        contaBancaria1.deposita(new BigDecimal(100));

        contaBancaria1.consultaSaldo();

    }
}
