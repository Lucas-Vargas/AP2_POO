package View;

import Model.user.Cliente;
import Model.user.Credenciado;
import Model.user.Vendedor;
import Model.Loja;

//TODO: Validações e tratamentos de exceção

public class Controller_usuario implements Usuario_Interface {
    public Cliente newCliente(String nome, String cpf, String telefone, String email) {
            return new Cliente(nome, cpf, telefone, email);
        }
    public Vendedor newVendedor(String nome, String cpf, double comissao, double salario, Loja loja) {
            return new Vendedor(nome, cpf, comissao, salario, loja);
        }
    public Credenciado newCredenciado(String nome, String cpf, String telefone, String email, int codigo, boolean possui_cartao, double desconto_default) {
            return new Credenciado(nome,cpf,telefone,email,codigo,possui_cartao,desconto_default);
        }

    public void inativarCliente(Cliente cliente){
        cliente.inativar();
    }
    public void inativarVendedor(Vendedor vendedor){
        vendedor.inativar();
    }
    public void inativarCredenciado(Credenciado credenciado){
        credenciado.inativar();
    }

    public void editarDadosCliente(Cliente cliente, int[] opcoes, String[] alteracoes){
        cliente.EditarDados(opcoes, alteracoes);
    }
    public void editarDadosVendedor(Vendedor vendedor, int[] opcoes, String[] alteracoes){
        vendedor.EditarDados(opcoes, alteracoes);
    }
    public void editarDadosCredenciado(Credenciado credenciado, int[] opcoes, String[] alteracoes){
        credenciado.EditarDados(opcoes, alteracoes);
    }
}
