public class Engenheiro extends Funcionario {

    public Engenheiro(String nome, String cpf, double salario){
        super(nome, cpf, salario);
    }

    public double getBonificacao(){
        return super.getSalario() * 0.4;
    }
}
