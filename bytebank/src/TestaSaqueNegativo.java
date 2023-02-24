import java.math.BigDecimal;

public class TestaSaqueNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(new BigDecimal(100));
//        conta.saca(new BigDecimal(101));
        BigDecimal saldoNegativo;

//        Proibido - Após tornar o método saldo privado essa operação não é mais possível
//        saldoNegativo = conta.saldo.subtract(new BigDecimal(101));
//        conta.setSaldo(saldoNegativo);

        conta.consultaSaldo();

    }
}
