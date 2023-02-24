import java.math.BigDecimal;


public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaBancaria1 = new Conta();
        contaBancaria1.deposita(new BigDecimal(100));

        contaBancaria1.consultaSaldo();

        Conta contaBancaria2 = new Conta();
        contaBancaria2.deposita(new BigDecimal(1000));

        contaBancaria2.saca(new BigDecimal(100));
        contaBancaria2.consultaSaldo();

        contaBancaria2.transfere(new BigDecimal(387), contaBancaria1);

        contaBancaria2.consultaSaldo();

        Cliente cliente1 = new Cliente();
        cliente1.nome = "Jade Viana";
        cliente1.cpf = "133.133.133-13";
        cliente1.profissao = "herdeira";

        contaBancaria1.titular = cliente1;
        contaBancaria1.deposita(new BigDecimal(50));
        System.out.println(contaBancaria1.titular.nome);
        contaBancaria1.consultaSaldo();


    }

}
