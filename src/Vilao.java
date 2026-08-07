public class Vilao extends Personagem {

    private int nivelDeAmeaca;

    public Vilao(String nome, Sexo sexo, double altura, int nivelDeAmeaca) {
        super(nome, sexo, altura);
        this.nivelDeAmeaca = nivelDeAmeaca;

        if (nivelDeAmeaca < 1 || nivelDeAmeaca > 10) {
            throw  new IllegalArgumentException("Nível de ameaça deve ser entre 1 e 10");
        }
    }

    public int getNivelDeAmeaca() {
        return nivelDeAmeaca;
    }

    public void setNivelDeAmeaca(int nivelDeAmeaca) {
        this.nivelDeAmeaca = nivelDeAmeaca;
    }

    @Override
    public String apresentar() {
        return "Sou vilão " + getNome() + " e meu nível de ameaça é " + getNivelDeAmeaca();
    }
}
