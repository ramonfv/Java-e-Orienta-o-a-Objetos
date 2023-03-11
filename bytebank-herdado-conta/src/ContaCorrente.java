import java.math.BigDecimal;

public class ContaCorrente extends Conta implements Tributavel{

    public ContaCorrente(int agencia, int numero){
        super(agencia, numero);

    }

    @Override
    public BigDecimal saca(BigDecimal valor) {
        BigDecimal taxaDeManuntencao = BigDecimal.valueOf(0.2);
        BigDecimal novoValor;
        novoValor = valor.add(taxaDeManuntencao);
        return super.saca(valor);
    }

    @Override
    public BigDecimal getImposto() {
        return super.consultaSaldo().multiply(new BigDecimal(0.01));
    }
}
