package Model;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private Map<Produto, Double> produtos; // Produto -> quantidade

    public Estoque() {
        this.produtos = new HashMap<>();
    }

    public void adicionarProduto(Produto produto, double quantidade) {
        if (produto == null || quantidade <= 0) return;
        produtos.put(produto, produtos.getOrDefault(produto, 0.0) + quantidade);
    }

    public void removerProduto(Produto produto, double quantidade) {
        if (produto == null || quantidade <= 0 || !produtos.containsKey(produto)) return;
        double atual = produtos.get(produto);
        if (atual <= quantidade) {
            produtos.remove(produto);
        } else {
            produtos.put(produto, atual - quantidade);
        }
    }

    public boolean verificarDisponibilidade(Produto produto, double quantidade) {
        if (produto == null || !produtos.containsKey(produto)) return false;
        return produtos.get(produto) >= quantidade;
    }

    public void exibirEstoque() {
        System.out.println("\n--- Estoque Atual ---");
        if (produtos.isEmpty()) {
            System.out.println("Estoque vazio.");
            return;
        }
        for (Map.Entry<Produto, Double> entry : produtos.entrySet()) {
            Produto p = entry.getKey();
            double q = entry.getValue();
            System.out.println(p.getNome() + " | " + p.getDescricao() + " | Preço: " + p.getPreco() + " | Quantidade: " + q);
        }
        System.out.println("---------------------\n");
    }
}
