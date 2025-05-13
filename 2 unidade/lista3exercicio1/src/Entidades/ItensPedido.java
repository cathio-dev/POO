package Entidades;

public class ItensPedido {
    private Integer quantidade;
    private Double preco;
    private Produto produto;

    public ItensPedido(Integer quantidade, Double preco) {
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double subtotal() {
        Double subtotal = 0.0;
        subtotal = produto.getPreco() * quantidade;

        return subtotal;
    }

    @Override
    public String toString() {
        return produto.getNome() + ", R$ " + quantidade + ", Subtotal: R$ " + subtotal();
    }

    
}
