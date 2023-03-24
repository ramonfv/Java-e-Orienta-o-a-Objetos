import java.math.BigDecimal;

public class TesteSaca {
    public static void main(String[] args) {
        Conta contaDoRamon = new ContaCorrente(2858, 996);

        contaDoRamon.deposita(new BigDecimal(259.69));
        try{
            contaDoRamon.saca(new BigDecimal(3000.36));

        }catch (SaldoInsuficienteException ex){
            System.out.println(ex.getMessage());

        }

        System.out.println(contaDoRamon.consultaSaldo());
    }
}
