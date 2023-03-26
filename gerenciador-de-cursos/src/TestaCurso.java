import com.sun.deploy.security.AuthKey;

import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo");
//        List<Aula> aulas = javaColecoes.getAulas();

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando coleções", 22));
        System.out.println(javaColecoes.getAulas());
    }
}
