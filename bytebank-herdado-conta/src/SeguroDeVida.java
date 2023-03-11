import java.math.BigDecimal;

public class SeguroDeVida implements Tributavel {


    @Override
    public BigDecimal getImposto() {
        return BigDecimal.valueOf(42);
    }
}
