package View;
import Model.Estoque;
import Model.Produto;

public class Controller_produto implements Produto_Interface {
    public Produto cadastroProduto(String nome, String descricao, double preco, Estoque estoque){
        return new Produto(nome, descricao, preco, estoque);
    }
    public void excluirProduto(Produto produto){
        produto.excluir();
    }
    public void alterarEstoque(double valor, Produto produto){

        double valor_anterior = produto.getEstoque().getQuantidade();
        if(valor_anterior==valor){
            System.out.println("Quantidades iguais. Operação cancelada.\nValor fornecido"+valor+"\nValor atual"+valor_anterior);
            return;
        }
        produto.getEstoque().setQuantidade(valor);
        double valor_atual = produto.getEstoque().getQuantidade();

        System.out.println("Estoque alterado de " + valor_anterior + "para "+ valor_atual);
    }
    public void alterarDescricao(String descricao, Produto produto){
        produto.setDescricao(descricao);
    }
    public void alterarNome(String nome, Produto produto){
        produto.setNome(nome);
    }
    public void alterarPreco(double preco, Produto produto){
        produto.setPreco(preco);
    }
}
