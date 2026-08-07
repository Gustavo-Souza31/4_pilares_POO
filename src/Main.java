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
                habilidades
        );

        h.mostrar();

        System.out.println(h.getIdentidade());
        System.out.println(h.revelarIdentidade());

        // Teste da cópia defensiva
        List<String> copia = h.getHabilidades();
        copia.add("teletransporte");

        System.out.println("\nLista do objeto:");
        h.mostrar();
    }
}