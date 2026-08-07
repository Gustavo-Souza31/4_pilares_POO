public class Vilao extends Personagem {

    private int nivelAmeaca;

    public Vilao(String nome, Sexo sexo, double altura, int nivelAmeaca) {
        super(nome, sexo, altura);
        this.nivelAmeaca = nivelAmeaca;
    }

    @Override
    public String apresentar() {
        return "Vilão: " + toString();
    }

    @Override
    public void agir() {
        System.out.println(getNome() + " ataca com ameaça nível " + nivelAmeaca + "!");
    }

    @Override
    public String toString() {
        return super.toString() + " - nível de ameaça: " + nivelAmeaca;
    }
}
