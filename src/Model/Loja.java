package Model;

public class Loja {
    private int id_loja;
    private double receita;
    private String nome;
    private boolean ativa;

    public double getReceita() {
        return receita;
    }
    private void setReceita(double receita) {
        this.receita = receita;
    }

    public String resumo_loja(){
        return "Nome: "+this.nome+"\nReceita: "+this.receita+"\nAtiva: "+this.ativa;
    }

}
