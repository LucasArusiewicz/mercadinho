package app;

/**
 * Pessoa
 */
public class Pessoa {

    private final int codigo;
    private final String nome;

    public Pessoa() {
        codigo = GetNovoCodigo();
        nome = GetNomePadrao();
    }

    public Pessoa(int codido) {
        this.codigo = codido;
        nome = GetNomePadrao();
    }

    public Pessoa(String nome) {
        codigo = GetNovoCodigo();
        this.nome = nome;
    }

    public Pessoa(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public static int GetNovoCodigo() {
        return (int)(100.0 * Math.random());
    }

    public static String GetNomePadrao() {
        return "Nome Pessoa não informado.";
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Nome: %s", codigo, nome);
    }
}
