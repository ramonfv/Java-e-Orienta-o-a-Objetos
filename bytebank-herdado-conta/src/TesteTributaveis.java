import java.math.BigDecimal;

public class TesteTributaveis {
    public static void main(String[] args) {
        ContaCorrente ccJade = new ContaCorrente(2355, 297836);
        ccJade.deposita(new BigDecimal(1400));

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorDeImposto valorATributar = new CalculadorDeImposto();
        valorATributar.registra(ccJade);
        valorATributar.registra(seguro);
//

        System.out.println(valorATributar.getImpostoTotal());
//    }
    }
}
