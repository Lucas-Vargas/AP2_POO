package Model.user;

public abstract class Pessoa {
    protected String nome;
    protected String cpf;
    protected boolean ativo;

    abstract void Inativar();
    abstract void EditarDados(int[] opcoes, String[] alteracoes);


    //setters
    protected void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    protected void setCpf(String cpf) {
        this.cpf = cpf;
    }
    protected void setNome(String nome) {
        this.nome = nome;
    }
}
