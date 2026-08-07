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
        return "Meu nome é " + getNome();
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

    public void mostrar() {
        System.out.println(getNome() + " - " +
                getSexo().getDescricao() + " - " +
                getAltura());

        for (String h : habilidades) {
            System.out.println(h);
        }
    }
}