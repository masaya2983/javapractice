import java.util.HashSet;
import java.util.Set;

public class Main{
 public static void main(String[] args){
    Set<String> words = new TreeSet<String>();
    words.add("dog");
    words.add("cat");
    words.add("wolf");
    words.add("panda");
    for (String s : words) {
      System.out.println(s + "→");
    }
  }
}