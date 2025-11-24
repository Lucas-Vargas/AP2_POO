package Model.user;

// Interface ICliente para seguir o princípio da Programação para Interface.
public interface ICliente {

    // Métodos essenciais que Cliente e Credenciado devem ter
    String getNome();
    String getCpf();
    boolean isAtivo();
    void inativar();

    // Supondo um método genérico de edição que ambos possuem
    void EditarDados(int[] codigos, String[] dados);

    // Supondo que Cliente tem débito (no caso do Credenciado)
    double getDebito();
}
