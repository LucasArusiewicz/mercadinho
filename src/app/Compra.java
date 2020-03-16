package app;

import java.util.List;

/**
 * Compra
 */
public class Compra {

    private Pessoa comprador;
    private String date;
    private List<ItemCompra> itemCompras;

    public Compra(Pessoa comprador) {
        this.comprador = comprador;
    }

    public Compra(Pessoa comprador, String date) {
        this.comprador = comprador;
        this.date = date;
    }

    public void Comprar(Produto itemComprado) {
        itemCompras.add(new ItemCompra(1, itemComprado));
    }

    public void Comprar(int quantidade, Produto itemComprado) {
        itemCompras.add(new ItemCompra(quantidade, itemComprado));
    }

    public double ValorTotal() {
        double valorTotal = 0.0f;

        for (ItemCompra itemCompra : itemCompras) {
            valorTotal += itemCompra.ValorTotal();
        }

        return valorTotal;
    }

    public void fecharCompra() {
        Nota nota = new Nota(this);
        System.out.println(nota.toString());
    }

    /**
     * @return the itemCompras
     */
    public List<ItemCompra> getItemCompras() {
        return itemCompras;
    }

    /**
     * @return the comprador
     */
    public Pessoa getComprador() {
        return comprador;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }
}
