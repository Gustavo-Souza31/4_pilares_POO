import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> habilidades = new ArrayList<>();
        habilidades.add("super força");
        habilidades.add("visão de raio-x");
        habilidades.add("voar");
        habilidades.add("super velocidade");
        habilidades.add("sopro congelante");

        SuperHeroi h = new SuperHeroi(
                "Lisiane Reips",
                Sexo.MULHER,
                1.75,
                true,
                "Lisiane Reips",
                "Super-Girl",
                habilidades
        );

        Vilao v = new Vilao(
                "Zeus",
                Sexo.HOMEM,
                2.80,
                10
        );

        Civil c = new Civil(
                "Afonso",
                Sexo.PREFIRO_NAO_DIZER,
                1.76,
                "Dev Web Sênior"
        );



        h.mostrar();

        System.out.println(h.getIdentidade());
        System.out.println(h.revelarIdentidade());
        System.out.println(h.apresentar());
        System.out.println(v.apresentar());
        System.out.println(c.apresentar());


        // Teste da cópia defensiva
        List<String> copia = h.getHabilidades();
        copia.add("teletransporte");

        System.out.println("\nLista do objeto:");
        h.mostrar();
    }
}