import java.math.BigDecimal;

public class TesteContas {
    public static void main(String[] args) throws SaldoInsuficienteException{

        ContaCorrente cc = new ContaCorrente(2599, 33695);
        cc.deposita(new BigDecimal(200.06));
        cc.saca(new BigDecimal(10.06));
        cc.consultaSaldo();

        ContaPoupanca cp = new ContaPoupanca(6698, 22478);
        cp.deposita(new BigDecimal(965.96));
        cp.consultaSaldo();
    }
}
