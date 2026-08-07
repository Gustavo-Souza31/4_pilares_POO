public class Civil extends Personagem {

<<<<<<< HEAD
    private String profissao;

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public Civil(String nome, Sexo sexo, double altura, String profissao){
        super(nome, sexo, altura);
        this.profissao = profissao;


=======
    public Civil(String nome, Sexo sexo, double altura) {
        super(nome, sexo, altura);
>>>>>>> Gustavo-Souza31-em_desenvolvimento
    }

    @Override
    public String apresentar() {
<<<<<<< HEAD
        return "Me chamo " + getNome() + " e minha profissão é: " + getProfissao();
=======
        return "Civil: " + toString();
    }

    @Override
    public void agir() {
        System.out.println(getNome() + " pede socorro!");
    }

    @Override
    public String toString() {
        return super.toString();
>>>>>>> Gustavo-Souza31-em_desenvolvimento
    }
}
