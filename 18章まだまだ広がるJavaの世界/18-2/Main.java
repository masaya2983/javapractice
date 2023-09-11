import java.io.InputStream;
import java.net.URL;

public class Main{
  public static void main(String[]args) throws Exception{
    FileWriter fw = new FileWriter("data.txt");
    fw.write('そ');
    fw.write('れ');
    fw.write('で');
    fw.write('は');
  }
}