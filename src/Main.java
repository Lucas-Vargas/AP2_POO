import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;




public static void main(String[] args) {
    final String FILENAME = "Venda_Id.txt";
    final String FILEPATH = "./"+FILENAME;

    String id_temp = Integer.toString(3);

    try (FileWriter fileWriter = new FileWriter(FILENAME);BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
        bufferedWriter.write(id_temp);
    } catch (IOException e) {
        System.err.println(":("+e.getMessage());
    }


    String firstLine = "";

    try (BufferedReader reader = new BufferedReader(new FileReader(FILEPATH))) {
        firstLine = reader.readLine();
    } catch (IOException e) {
        System.err.println(":(: " + e.getMessage());
    }
    try{ //trata se o arquivo estiver vazio
        System.out.println(Integer.parseInt(firstLine));
    } catch (NumberFormatException e) {
        System.out.println(-1+"\n"+e.getMessage());
    }


}