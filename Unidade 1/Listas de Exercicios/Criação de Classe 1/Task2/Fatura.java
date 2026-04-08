public class Fatura {
    private String id;
    private String descricao;
    private int quantidade;
    private double precoUnitario;

    public Fatura(String id, String descricao, int quantidade, double precoUnitario) {
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade > 0 ? quantidade : 0;
        this.precoUnitario = precoUnitario > 0 ? precoUnitario : 0.0;
    }

    public double calculaTotal() {
        return quantidade * precoUnitario;
    }

    public String getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade > 0 ? quantidade : 0;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario > 0 ? precoUnitario : 0.0;
    }
}
