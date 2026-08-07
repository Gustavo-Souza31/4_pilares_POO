public class Civil extends Personagem {

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


    }

    @Override
    public String apresentar() {
        return "Me chamo " + getNome() + " e minha profissão é: " + getProfissao();
    }
}
