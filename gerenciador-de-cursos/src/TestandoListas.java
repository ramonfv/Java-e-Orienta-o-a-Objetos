import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestandoListas {
    public static void main(String[] args) {

        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalhando com cursos e sets";

        ArrayList<String> aulas = new ArrayList<>();

        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        aulas.remove(0);

        System.out.println(aulas);

        for (String aula: aulas
             ) {
            System.out.println("Aula : " + aula);
        }

        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é : " + primeiraAula);

        aulas.forEach(aula -> {
            System.out.println("percorrendo :" + aula);
        });

        aulas.add("Aumentando nosso conhecimento");
        Collections.sort(aulas);
        System.out.println("Depois de ordenado:");
        System.out.println(aulas);
    }
}
