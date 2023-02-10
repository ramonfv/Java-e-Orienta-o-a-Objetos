public class TestaConversao {

    public static void main(String[] args){

        double salario = 1270.50;
//        int valor = salario;  // essa linha não compila, não é possível atribuir uma variável double dentro da int

        int valor = (int) salario; // Quando fazemos um casting (pedir ao java para transformar o valor)

        System.out.println(valor);

//        float pontoFlutuante = 3.14; // 3.14 é um valor double e float tem apenas 32 bits, sendo assim é necessário
                                    // aplicar o contorno do casting ou declarar com odouble

        float pontoFlutuante = 3.14f;

    }
}
