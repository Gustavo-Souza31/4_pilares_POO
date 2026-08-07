public class Civil extends Personagem {

    public Civil(String nome, Sexo sexo, double altura) {
        super(nome, sexo, altura);
    }

    @Override
    public String apresentar() {
        return "Civil: " + toString();
    }

    @Override
    public void agir() {
        System.out.println(getNome() + " pede socorro!");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
