package View;
import Model.Produto;
import Model.Venda;
import Model.user.Cliente;
import Model.user.Vendedor;

public class Controller_venda implements Usuario_Interface {
    public Venda newVenda(Cliente cliente, Vendedor vendedor, Produto[] produtos, int quant_parcelas){
        return new Venda(cliente, vendedor, produtos, quant_parcelas);
    }
    public void excluirVenda(Venda venda){
        venda.excluir();
        System.out.println("Venda excluida com sucesso!\nId da venda: "+venda.getId_venda());
    }
    public void devolverVenda(Venda venda){
        venda.devolver();
    }
}
