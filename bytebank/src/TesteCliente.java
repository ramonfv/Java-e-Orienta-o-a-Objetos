import java.math.BigDecimal;

public class TesteCliente {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.nome = "Jade Viana";
        cliente1.cpf = "133.133.133-13";
        cliente1.profissao = "herdeira";

        Conta contaBancaria1 = new Conta();
        contaBancaria1.deposita(new BigDecimal(13));

        contaBancaria1.titular = cliente1;
        contaBancaria1.deposita(new BigDecimal(50));
        System.out.println(contaBancaria1.titular.nome);
        contaBancaria1.consultaSaldo();
    }
}
