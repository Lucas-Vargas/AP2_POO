package Model;

import Model.user.Vendedor;
import java.util.ArrayList;
import java.util.List;

public class Loja {
    private int id_loja;
    private double receita = 0.0;
    private String nome;
    private boolean ativa;
    private Estoque estoque;
    private List<Vendedor> vendedores;
    private List<Venda> vendasRealizadas;

    public Loja() {
        this.nome = "Loja Principal";
        this.ativa = true;
        this.estoque = new Estoque();
        this.vendedores = new ArrayList<>();
        this.vendasRealizadas = new ArrayList<>();
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void adicionarVendedor(Vendedor v) {
        if (v != null && !vendedores.contains(v)) {
            vendedores.add(v);
        }
    }

    public void registrarVenda(Venda venda) {
        if (venda != null) {
            vendasRealizadas.add(venda);
            receita += venda.getValor();
        }
    }

    public List<Venda> getVendasRealizadas() {
        return vendasRealizadas;
    }

    public String resumo_loja() {
        return "Nome: " + nome + "\nReceita: " + receita + "\nAtiva: " + ativa;
    }

    // getters/setters básicos
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
    public boolean isAtiva() {
        return ativa;
    }
}
