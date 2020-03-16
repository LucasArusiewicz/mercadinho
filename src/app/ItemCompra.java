package app;

/**
 * ItemCompra
 */
public class ItemCompra {

    private Produto produto;
    private int quantidade;

    public ItemCompra(int quantidade, Produto produto) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double ValorTotal() {
        return quantidade * produto.getPreco();
    }

    /**
     * @return the produto
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }
}
