import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class TestaCurso2 {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo");
//        List<Aula> aulas = javaColecoes.getAulas();

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando coleções", 22));
        System.out.println(javaColecoes.getAulas());

        List<Aula> aulasImutavies = javaColecoes.getAulas();
        System.out.println(aulasImutavies);

        List<Aula> aulas = new ArrayList<>(aulasImutavies);

        Collections.sort(aulas);
        System.out.println(aulas);

        System.out.println(javaColecoes.getTempoTotal());

        System.out.println(javaColecoes);

    }

}
