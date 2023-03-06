public class ControleBonificacao {

    private double soma;
    public void registra (Funcionario tipo){
        double valor = tipo.getBonificacao();
        this.soma = this.soma + valor;

    }

    public double getSoma() {
        return soma;
    }
}
