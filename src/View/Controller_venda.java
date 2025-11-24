package View;
import Model.Loja;
import Model.Produto;
import Model.Venda;
import Model.user.Cliente;
import Model.user.Credenciado;
import Model.user.Vendedor;

public class Controller_venda implements Vendar_interface {
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
