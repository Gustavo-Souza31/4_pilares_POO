import java.util.ArrayList;
import java.util.List;

public class SuperHeroi extends Personagem {

    private boolean identidadeSecreta;
    private String identidadeReal;
    private List<String> habilidades;

    public SuperHeroi(String nome, Sexo sexo, double altura,
                      boolean identidadeSecreta,
                      String identidadeReal,
                      List<String> habilidades) {

        super(nome, sexo, altura);

        this.identidadeSecreta = identidadeSecreta;
        this.identidadeReal = identidadeReal;
        this.habilidades = new ArrayList<>(habilidades);
    }

    @Override
    public String apresentar() {
        return "Super-herói: " + toString();
    }

    @Override
    public void agir() {
        System.out.println(usarHabilidade());
    }

    public String getIdentidade() {
        if (identidadeSecreta) {
            return "??? (identidade protegida)";
        }
        return identidadeReal;
    }

    public String revelarIdentidade() {
        return identidadeReal;
    }

    public List<String> getHabilidades() {
        return new ArrayList<>(habilidades);
    }

    public String usarHabilidade() {
        return usarHabilidade(0);
    }

    public String usarHabilidade(int indice) {
        if (indice < 0 || indice >= habilidades.size()) {
            return getNome() + " não possui habilidade nesse índice.";
        }

        return getNome() + " usa " + habilidades.get(indice) + ".";
    }

    public String usarHabilidade(String nome) {
        for (String habilidade : habilidades) {
            if (habilidade.equalsIgnoreCase(nome)) {
                return getNome() + " usa " + habilidade + ".";
            }
        }

        return getNome() + " não possui a habilidade " + nome + ".";
    }

    public void mostrar() {
        System.out.println(toString());

        for (String h : habilidades) {
            System.out.println(h);
        }
    }

    @Override
    public String toString() {
        return super.toString() + " - habilidades: " + habilidades;
    }
}