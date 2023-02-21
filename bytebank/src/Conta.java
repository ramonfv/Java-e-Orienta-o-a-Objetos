import java.math.BigDecimal;
import java.util.Scanner;
import java.sql.*;


public class Conta {
    BigDecimal saldo;
    int agencia;
    int numero;
    String titular;

//    Método para depositar um valor a conta
    public BigDecimal deposita(BigDecimal valor) {
        if (this.saldo == null) {
            this.saldo = valor;

        } else {
            this.saldo = this.saldo.add(valor);
        }
        System.out.println("Depótiso de R$ " + valor + " realizado com sucesso");
        return valor;

    }

//    Método para consultar o saldo da conta
    public BigDecimal consultaSaldo(){
        System.out.println("O saldo atual da sua conta: R$ " + this.saldo);
        return this.saldo;
    }

//    Método para sacar um valor da conta
    public BigDecimal saca(BigDecimal valor){
//        if (this.saldo >= valor){ Obtive um erro de sintaxe, descobri que não é possível fazer comparações
//        com variaveis do tupo BigDecimal utilizando (=, <, >) diretamente.
//        Para tal, utilza-se o método  "compareTo" para fazer essa verificação. O retorno do método é um inteiro
//        e assume um número negativo se o primeiro objeto for menor que o segundo, zero se forem iguais e um
//        número positivo se o primeiro objeto for maior que o segundo.
        if (this.saldo.compareTo(valor) >= 0){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Solicitado saque de: R$ " + valor);
            System.out.println("Você confirma essa transação? (s/n)");
            String confirmacao = scanner.nextLine();

            if (confirmacao.equalsIgnoreCase("s")){
                BigDecimal novoSaldo = this.saldo.subtract(valor);
                this.saldo = novoSaldo;
                System.out.println("Saque de R$ " + valor + " realizado com sucesso");
                return valor;
            }else if (confirmacao.equalsIgnoreCase("n")){
                System.out.println(" Saque cancelado pelo usuário");
                return BigDecimal.ZERO;
            }
        }  else {
            System.out.println("Saldo insuficiente");
            return BigDecimal.ZERO;
        }
    return this.saldo;
    }

    public BigDecimal transfere(BigDecimal valor, Conta destino){

        if(this.saldo.compareTo(valor) >=0){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Solicitada transferência de R$: " + valor + " para a conta " + destino);
            System.out.println("Você confirma essa transação? (s/n)");
            String confirmacao = scanner.nextLine();

            if(confirmacao.equalsIgnoreCase("s")){
                BigDecimal novoSaldo = this.saldo.subtract(valor);
                this.saldo = novoSaldo;
                destino.deposita(valor);
                System.out.println("Transferência realizada com sucesso");
                return valor;
            } else if (confirmacao.equalsIgnoreCase("n")) {
                System.out.println("Operação cancelada pelo usuário");
            }

        }else{
            System.out.println("O valor socilitado não pode ser transferido");
        }
    return valor;
    }
}

