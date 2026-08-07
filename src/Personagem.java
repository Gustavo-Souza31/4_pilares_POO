public abstract class Personagem {

    private String nome;
    private Sexo sexo;
    private float altura;

    public Personagem(String nome, Sexo sexo, float altura ) {

        this.nome = nome;
        this.sexo = sexo;
        this.altura = altura;

    }
    public String getNome() {
        return nome;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public float getAltura() {
        return altura;
    }

    public abstract String apresentar();
}