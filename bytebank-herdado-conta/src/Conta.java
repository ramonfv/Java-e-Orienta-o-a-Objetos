import java.math.BigDecimal;
import java.util.Scanner;
import java.sql.*;


public abstract class Conta {
    private BigDecimal saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int numeroDeContas;


    public Conta(int agencia, int numero) {
        Conta.numeroDeContas++;
        this.numero = numero;
        this.agencia = agencia;

    }

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
    public BigDecimal consultaSaldo() {
        System.out.println("Saldo atual da sua conta: R$ ");
        return this.saldo;
    }

    //    Método para sacar um valor da conta
    public void saca(BigDecimal valor) throws SaldoInsuficienteException{
//        if (this.saldo >= valor){ Obtive um erro de sintaxe, descobri que não é possível fazer comparações
//        com variaveis do tupo BigDecimal utilizando (=, <, >) diretamente.
//        Para tal, utilza-se o método  "compareTo" para fazer essa verificação. O retorno do método é um inteiro
//        e assume um número negativo se o primeiro objeto for menor que o segundo, zero se forem iguais e um
//        número positivo se o primeiro objeto for maior que o segundo.
        if (this.saldo.compareTo(valor) <= 0) {

            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);

        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solicitado saque de: R$ " + valor);
        System.out.println("Você confirma essa transação? (s/n)");
        String confirmacao = scanner.nextLine();
//
        if (confirmacao.equalsIgnoreCase("s")){
            BigDecimal novoSaldo = this.saldo.subtract(valor);
            this.saldo = novoSaldo;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso");
        }else if (confirmacao.equalsIgnoreCase("n")){
                System.out.println(" Saque cancelado pelo usuário");
            }
    }

    public void transfere(BigDecimal valor, Conta destino) throws SaldoInsuficienteException{

        this.saca(valor);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solicitada transferência de R$: " + valor + " para a conta " + destino);
        System.out.println("Você confirma essa transação? (s/n)");
        String confirmacao = scanner.nextLine();
        if (confirmacao.equalsIgnoreCase("s")) {
            BigDecimal novoSaldo = this.saldo.subtract(valor);
            this.saldo = novoSaldo;
            destino.deposita(valor);
            System.out.println("Transferência realizada com sucesso");
        } else if (confirmacao.equalsIgnoreCase("n")) {
            System.out.println("Operação cancelada pelo usuário");
        }
    }
    public int getNumero() {
        return this.numero;
    }

    public int setNumero(int numero) {

        if (numero <= 0) {
            System.out.println("Este número de contanão é válido!");
            return numero;
        }
        System.out.println("O número da sua conta foi alterado com sucesso. Seu número da conta é " + numero);

        return this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Este número de agência não é válido!");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getNumeroDeContas() {
        return Conta.numeroDeContas;
    }


}