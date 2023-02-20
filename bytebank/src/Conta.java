import java.math.BigDecimal;

public class Conta {
    BigDecimal saldo;
    int agencia;
    int numero;
    String titular;

    public BigDecimal deposita(BigDecimal valor) {
        BigDecimal getValor = this.saldo.add(valor);
        this.saldo = getValor;
        System.out.println("Depótiso de R$ " + valor + " realizado com sucesso");
        return getValor;
    }

    public BigDecimal consultaSaldo(){
        System.out.println("O saldo atual da sua conta: R$ " + this.saldo);
        return this.saldo;
    }
}
