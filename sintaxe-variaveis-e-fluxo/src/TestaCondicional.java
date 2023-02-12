import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import sun.font.TrueTypeFont;

public class TestaCondicional {

    public static void main(String[] args) {

        System.out.println("Testando condicionais");
        int idade = 15;
        boolean acompanhadoDeResponsaveis = true;
        if (idade >= 18 || (acompanhadoDeResponsaveis == true && idade >= 12)){

            System.out.printf("seja bem vindo");

        }else {

            System.out.println("Infelizmente você não pode entrar");
        }

    }
}




