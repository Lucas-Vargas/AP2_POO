package Model;

public class Produto {
    private int id_produto;
    private String nome,descricao;
    private double preco;
    private Estoque estoque;

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

}
