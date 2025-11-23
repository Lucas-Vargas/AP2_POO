package Model.user;
import Model.Loja;

public class Vendedor extends Pessoa {

    private double comissao, salario;
    private Loja loja;

    public Vendedor(String nome, String cpf, double comissao, double salario, Loja loja) {
        this.nome = nome;
        this.cpf = cpf;
        this.ativo = true;
        this.comissao = comissao;
        this.salario = salario;
        this.loja = loja;
    }

    public void inativar() {
        this.setAtivo(false);
    }
    public void EditarDados(int[] opcoes, String[] alteracoes) {
        if(opcoes.length<=0 || alteracoes.length<=0) { // Tratamento de exceção
            System.out.println("Dados inválidos. Operação cancelada.");
            if(opcoes.length !=  alteracoes.length) {
                System.out.println("Quantidade de opções diferente da quantidade dos dados fornecidos. Operação cancelada.");
            }
        }//fim do tratamento de exceção
        /*
         * 1 = nome
         * 2 = cpf
         * 3 = comissao
         * 4 = salario
         * */
        for(int i = 0; i < opcoes.length; i++) {
            switch(opcoes[i]) {
                case 1:
                    this.setNome(alteracoes[i]); break;
                case 2:
                    this.setCpf(alteracoes[i]); break;
                case 3:
                    this.comissao  = Double.parseDouble(alteracoes[i]); break;
                case 4:
                    this.salario = Double.parseDouble(alteracoes[i]); break;
                default:
                    System.out.println("Dados inválidos");
            }
        }
    }//EditarDados end
    protected void EditarLoja(Loja loja){
        this.loja = loja;
    }
}
