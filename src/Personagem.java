public abstract class Personagem {

    private String nome;
    private Sexo sexo;
    private double altura;

    public Personagem(String nome, Sexo sexo, double altura) {

        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido.");
        }

        if (altura < 0.5 || altura > 3.0) {
            throw new IllegalArgumentException("Altura inválida.");
        }

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

    public double getAltura() {
        return altura;
    }

    public abstract String apresentar();
}