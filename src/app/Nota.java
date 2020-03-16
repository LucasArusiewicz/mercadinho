package app;

/**
 * Nota
 */
public class Nota {

    private Compra compra;

    public Nota(Compra compra) {
        this.compra = compra;
    }

    public String getInfoComprador() {
        return String.format("Comprador: %s, Data: %s", compra.getComprador(), compra.getDate());
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(getInfoComprador());

        stringBuilder.append("Produtos Comprados");

        for (ItemCompra itemCompra : compra.getItemCompras()) {
            Produto produtoAtual = itemCompra.getProduto();
            String infoLinha = String.format("x%d %.2f %s", itemCompra.getQuantidade(), produtoAtual.getPreco(), produtoAtual.getNome());
            stringBuilder.append(infoLinha);
        }

        stringBuilder.append(String.format("Total: %.2f", compra.ValorTotal()));

        return stringBuilder.toString();
    }
}
