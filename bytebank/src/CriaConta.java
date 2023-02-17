import java.math.BigDecimal;

public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = BigDecimal.valueOf(200.00);
        System.out.println(primeiraConta.saldo);

        BigDecimal valorAdicional = BigDecimal.valueOf(100);
        primeiraConta.saldo = primeiraConta.saldo.add(valorAdicional);
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = BigDecimal.valueOf(50);

        System.out.println("Primeira conta tem " + primeiraConta.saldo);
        System.out.println("Segunda conta tem " + segundaConta.saldo);


    }
}
