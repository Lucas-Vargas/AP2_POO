package View;

import Model.user.Cliente;
import Model.user.Credenciado;
import Model.user.Vendedor;
import Model.Produto;
import Model.Estoque;
import Model.Venda;
import Model.Loja;

public class Controller {
    //Usuario
        protected Cliente newCliente(String nome, String cpf, String telefone, String email) {
            return new Cliente(nome, cpf, telefone, email);
        }
        protected Vendedor newVendedor(String nome, String cpf, double comissao, double salario, Loja loja) {
            return new Vendedor(nome, cpf, comissao, salario, loja);
        }
        protected Credenciado newCredenciado(String nome, String cpf, String telefone, String email, int codigo, boolean possui_cartao, double desconto_default) {
            return new Credenciado(nome,cpf,telefone,email,codigo,possui_cartao,desconto_default);
        }
    //Venda
        protected Venda newVenda(Cliente cliente, Vendedor vendedor, Produto[] produtos, int quant_parcelas){
            return new Venda(cliente, vendedor, produtos, quant_parcelas);
        }
        protected void excluirVenda(Venda venda){
            venda.excluir();
            System.out.println("Venda excluida com sucesso!\nId da venda: "+venda.getId_venda());
        }
        protected void devolverVenda(Venda venda){
            venda.devolver();
        }
    //Produto
        protected Produto cadastroProduto(String nome, String descricao, double preco, Estoque estoque){
            return new Produto(nome, descricao, preco, estoque);
        }
        protected void excluirProduto(Produto produto){
            produto.excluir();
        }
        protected void alterarEstoque(double valor, Produto produto){

            double valor_anterior = produto.getEstoque().getQuantidade();
            if(valor_anterior==valor){
                System.out.println("Quantidades iguais. Operação cancelada.\nValor fornecido"+valor+"\nValor atual"+valor_anterior);
                return;
            }
            produto.getEstoque().setQuantidade(valor);
            double valor_atual = produto.getEstoque().getQuantidade();

            System.out.println("Estoque alterado de " + valor_anterior + "para "+ valor_atual);
        }
        protected void alterarDescricao(String descricao, Produto produto){
            produto.setDescricao(descricao);
        }
        protected void alterarNome(String nome, Produto produto){
            produto.setNome(nome);
        }
        protected void alterarPreco(double preco, Produto produto){
            produto.setPreco(preco);
        }
}
