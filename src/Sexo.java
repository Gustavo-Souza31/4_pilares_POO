public enum Sexo {

    MULHER("Seu personagem é do sexo feminino"),
    HOMEM("Seu personagem é do sexo masculino"),
    OUTRO("Seu personagem possui outro sexo"),
    PREFIRO_NAO_DIZER("Você prefere não informar o sexo do seu personagem");

    private String descricao;

    Sexo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}