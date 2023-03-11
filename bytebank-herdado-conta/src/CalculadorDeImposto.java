import java.math.BigDecimal;

public class CalculadorDeImposto {
//
    public CalculadorDeImposto(){
        this.impostoTotal = BigDecimal.ZERO;
    }
    private BigDecimal impostoTotal;
    public void registra(Tributavel tributacao){
        BigDecimal valor = tributacao.getImposto();
        this.impostoTotal = impostoTotal.add(valor);

    }

    public BigDecimal getImpostoTotal() {
        return impostoTotal;
    }
}
