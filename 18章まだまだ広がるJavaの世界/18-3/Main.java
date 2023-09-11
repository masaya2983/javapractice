import java.io.InputStream;
import java.net.URL;

public class Main{
  public static void main(String[]args) throws Exception{
    URL u = new URL("https://book.impress.co.jp/");
    InputStreeam is = u.openStream();
    int i = is.read();
    while (i != -1){
      char c = (char)i;
      System.out.println(c);
      i = is.read();
    }
  }
}