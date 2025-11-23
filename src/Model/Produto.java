package Model;

public class Produto {
    private String nome,descricao;
    private double preco;
    private Estoque estoque;
    private boolean existe;

    public Produto(String nome, String descricao, double preco, Estoque estoque){
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.estoque = estoque;
    }

    public boolean ValidarPreco(double preco) {
        if (preco <= 0) {
            return false;
        }else{
            return true;
        }
        //TODO later
    }
    public boolean ValidarnomeDesc(String descricao, String nome) {
        if(descricao.isEmpty() || nome.isEmpty()) {
            return false;
        }else{
            return true;
        }
        //TODO later
    }

    public double getPreco() {
        return preco;
    }
    public Estoque getEstoque() {
        return estoque;
    }
    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }
    public void excluir() {
        this.existe = false;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}//endclass

