package Model;

public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private boolean existe;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.descricao = ""; // descrição opcional
        this.preco = preco;
        this.existe = true;
    }

    public Produto(int id, String nome, String descricao, double preco) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.existe = true;
    }

    public void excluir() {
        this.existe = false;
    }

    public boolean isExiste() {
        return existe;
    }

    // Getters e setters
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public double getPreco() {
        return preco;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
