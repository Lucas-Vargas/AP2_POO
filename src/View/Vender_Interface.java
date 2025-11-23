package View;

import Model.Produto;
import Model.Venda;
import Model.user.Cliente;
import Model.user.Vendedor;

public interface Vender_Interface {
    public Venda newVenda(Cliente cliente, Vendedor vendedor, Produto[] produtos, int quant_parcelas);
    public void excluirVenda(Venda venda);
    public void devolverVenda(Venda venda);
}
