package Model.user;

// Interface IVendedor para seguir o princípio da Programação para Interface.
public interface IVendedor {

    // Métodos essenciais que todo Vendedor deve ter
    String getNome();
    String getCpf();
    double getSalario();

    // Supondo um método genérico de edição que Vendedor possui
    void EditarDados(int[] codigos, String[] dados);
}
