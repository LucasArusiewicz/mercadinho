package app;

/**
 * Produto
 */
public class Produto {

    private int codigo;
    private String nome;
    private double preco;

    public Produto(double preco) {
        codigo = GetNovoCodigo();
        nome = GetNomePadrao();
        this.preco = preco;
    }

    public Produto(int codido, double preco) {
        this.codigo = codido;
        nome = GetNomePadrao();
        this.preco = preco;
    }

    public Produto(String nome, double preco) {
        codigo = GetNovoCodigo();
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    public static int GetNovoCodigo() {
        return (int)(100.0 * Math.random());
    }

    public static String GetNomePadrao() {
        return "Nome Produto não informado.";
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Preço: %.2f, Nome: %s", codigo, preco, nome);
    }
}
