package Model;

public class Estoque {
    private int id_estoque;
    private String nome, local;
    private double quantidade;

    public int getId_estoque() {
        return id_estoque;
    }
    public void setId_estoque(int id_estoque) {
        this.id_estoque = id_estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
}
