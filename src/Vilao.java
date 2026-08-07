public class Vilao extends Personagem {

<<<<<<< HEAD
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
=======
    private int nivelAmeaca;

    public Vilao(String nome, Sexo sexo, double altura, int nivelAmeaca) {
        super(nome, sexo, altura);
        this.nivelAmeaca = nivelAmeaca;
>>>>>>> Gustavo-Souza31-em_desenvolvimento
    }

    @Override
    public String apresentar() {
<<<<<<< HEAD
        return "Sou vilão " + getNome() + " e meu nível de ameaça é " + getNivelDeAmeaca();
=======
        return "Vilão: " + toString();
    }

    @Override
    public void agir() {
        System.out.println(getNome() + " ataca com ameaça nível " + nivelAmeaca + "!");
    }

    @Override
    public String toString() {
        return super.toString() + " - nível de ameaça: " + nivelAmeaca;
>>>>>>> Gustavo-Souza31-em_desenvolvimento
    }
}
