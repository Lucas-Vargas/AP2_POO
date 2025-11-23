package View;
import Model.Estoque;
import Model.Produto;

public interface Produto_Interface {
    public Produto cadastroProduto(String nome, String descricao, double preco, Estoque estoque);
    public void excluirProduto(Produto produto);
    public void alterarEstoque(double valor, Produto produto);
    public void alterarDescricao(String descricao, Produto produto);
    public void alterarNome(String nome, Produto produto);
    public void alterarPreco(double preco, Produto produto);
}
