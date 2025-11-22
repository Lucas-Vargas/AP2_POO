package Model;
import Model.user.Cliente;
import Model.Produto;
import Model.user.Vendedor;
//Para ler e escrever em um arquivo
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Venda {

    //variaveis
    private Cliente cliente;
    private Vendedor vendedor;
    private Produto[] produto;
    private double valor;
    private boolean devolvido, existe;
    private int id_venda, quant_parcelas;

    //constantes
    private final String FILENAME = "Venda_Id.txt";
    private final String FILEPATH = "./"+FILENAME;

    //construtor
    public Venda(Cliente cliente, Vendedor vendedor, Produto[] produtos, int quant_parcelas){//Troquei o metodo "NovaVenda()" pelo construtor. Acho que fica mais organizado assim"
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.produto = produtos;
        this.quant_parcelas = quant_parcelas;
        this.devolvido = false;
        this.existe = true;

        int id_temp = this.getIdFile();
        if(id_temp == -1){
            this.setIdFile(1);
        }
        else{
            this.setIdFile(id_temp+1);
        }

    }

    //metodos
    private int getIdFile(){
        String id_temp = "";

        try (BufferedReader reader = new BufferedReader(new FileReader(FILEPATH))) {
            id_temp = reader.readLine();
        } catch (IOException e) {
            System.err.println(":(: " + e.getMessage());
        }
        try{ //trata se o arquivo estiver vazio
            return Integer.parseInt(id_temp);
        } catch (NumberFormatException e) {
            return -1;
        }

    }// end method
    private void setIdFile(int id){
        String id_temp = Integer.toString(id);

        try {
            FileWriter fileWriter = new FileWriter(FILENAME);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(id_temp);
        } catch (IOException e) {
            System.err.println(":("+e.getMessage());
        }
    }// end method
    private double calcularValor(Produto[] produtos){
        double count = 0;
        for (int i = 0; i < produtos.length; i++){
            if(produtos[i] != null){
                count += produtos[i].getPreco();
            }else{
                System.out.println("produto com valor nulo encontrado. Encerrado operação.");
                break;
            }
        }
        return count;
    }
    public void excluir(){
        this.existe = false; //Não achei um destructor pra java, ent vai assim mesmo. Gabiarra is always the way
    }
    public void devolver(){
        this.devolvido = true;
    }

}// class
