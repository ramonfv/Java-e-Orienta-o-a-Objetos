public class TestaPontoFlutuante {

    public static void main(String[] args){

        double salario = 1250.70;

        System.out.println(salario);

//        Utilizando " + " para concatenar a variavel

        System.out.println("meu salario é " + salario);
//        Utiliznado o tipo int
        int divisao = 5 / 2;
        System.out.println(divisao); // Nesse caso, o tipo int é truncado, mas ainda assim continua sendo um int

//        Para resolver o problema, basta colocar um dos valores da expressão com alguma casa decimal
        double divisao_double = 5.0 / 2;
        System.out.println(divisao_double);
    }
}
