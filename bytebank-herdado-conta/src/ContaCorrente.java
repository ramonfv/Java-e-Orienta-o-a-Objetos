import java.math.BigDecimal;

public class ContaCorrente extends Conta implements Tributavel{

    public ContaCorrente(int agencia, int numero){
        super(agencia, numero);

    }

    @Override
    public void saca(BigDecimal valor) throws SaldoInsuficienteException{
        BigDecimal taxaDeManuntencao = BigDecimal.valueOf(0.2);
        BigDecimal novoValor;
        novoValor = valor.add(taxaDeManuntencao);
        super.saca(valor);
    }

    @Override
    public BigDecimal getImposto() {
        return super.consultaSaldo().multiply(new BigDecimal(0.01));
    }
}
