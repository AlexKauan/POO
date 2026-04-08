public class Fatura {
    private String numeroIdentificacao;
    private String descricao;
    private int quantidadeComprada;
    private double precoUnitario;

    public Fatura(String numeroIdentificacao, String descricao, int quantidadeComprada, double precoUnitario) {
        this.numeroIdentificacao = numeroIdentificacao;
        this.descricao = descricao;
        this.quantidadeComprada = quantidadeComprada > 0 ? quantidadeComprada : 0;
        this.precoUnitario = precoUnitario > 0 ? precoUnitario : 0.0;
    }

    public String getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public double calculaTotal() {
        return quantidadeComprada * precoUnitario;
    }
}
