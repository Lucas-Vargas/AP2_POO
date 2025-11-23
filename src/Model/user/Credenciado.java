package Model.user;

public class Credenciado extends Cliente{

    private int codigo;
    private boolean possui_cartao;
    private double desconto_default;

    public Credenciado(String nome, String cpf, String telefone, String email, int codigo, boolean possui_cartao, double desconto_default) {
        super(nome, cpf, telefone, email);
        this.codigo = codigo;
        this.possui_cartao = possui_cartao;
        this.desconto_default = desconto_default;
    }


    protected void Inativar() {
        this.setAtivo(false);
    }

    protected void EditarDados(int[] opcoes, String[] alteracoes) {
        if(opcoes.length<=0 || alteracoes.length<=0) { // Tratamento de exceção
            System.out.println("Dados inválidos. Operação cancelada.");
            if(opcoes.length !=  alteracoes.length) {
                System.out.println("Quantidade de opções diferente da quantidade dos dados fornecidos. Operação cancelada.");
            }
        }//fim do tratamento de exceção
        /*
         * 1 = nome
         * 2 = cpf
         * 3 = telefone
         * 4 = email
         * 5 = debito
         * */
        for(int i = 0; i < opcoes.length; i++) {
            switch(opcoes[i]) {
                case 1:
                    this.setNome(alteracoes[i]); break;
                case 2:
                    this.setCpf(alteracoes[i]); break;
                case 3:
                    this.telefone  = alteracoes[i]; break;
                case 4:
                    this.email = alteracoes[i]; break;
                case 5:
                    this.debito = Double.parseDouble(alteracoes[i]); break;
                default:
                    System.out.println("Dados inválidos");
            }
        }
    }//EditarDados end

    public void criar_cartao(){
        this.possui_cartao = true;
    }

}
