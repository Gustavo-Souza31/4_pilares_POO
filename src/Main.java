import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> habilidades = new ArrayList<>();
        habilidades.add("super força");
        habilidades.add("visão de raio-x");
        habilidades.add("voar");
        habilidades.add("super velocidade");

        List<Personagem> personagens = new ArrayList<>();
        personagens.add(new SuperHeroi(
                "Lisiane Reips",
                Sexo.MULHER,
                1.75,
                true,
                "Lisiane Reips",
<<<<<<< HEAD
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

=======
                habilidades));
        personagens.add(new Vilao(
                "Dr. Caos",
                Sexo.HOMEM,
                1.88,
                8));
        personagens.add(new Civil(
                "Ana Paula",
                Sexo.MULHER,
                1.62));

        System.out.println("============");
        for (Personagem personagem : personagens) {
            System.out.println(personagem);
            System.out.println(personagem.apresentar());
            personagem.agir();
            System.out.println();
        }

        System.out.println("=== SOBRECARGA: usarHabilidade() ===");
        SuperHeroi heroi = (SuperHeroi) personagens.get(0);
>>>>>>> Gustavo-Souza31-em_desenvolvimento

        System.out.println(heroi.usarHabilidade());

        System.out.println(heroi.usarHabilidade(2));

        System.out.println(heroi.usarHabilidade(99));

        System.out.println(heroi.usarHabilidade("voar"));
        System.out.println(heroi.usarHabilidade("teletransporte"));
    }
}