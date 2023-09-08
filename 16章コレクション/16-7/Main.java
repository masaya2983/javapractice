import java.util.*;

public class Main{
  public static void main (String[] args){
    Map<String, Integer>prefs = new HashMap<String, Integer>();
    prefs.put("京都府", 255);
    prefs.put("東京都" 1261);
    prefs.put("熊本県", 181);
    for (String Key : prefs.KeySet()) {
      int value = prefs.get(Key);
      System.out.println(Key + "の人口は、" + nalue);
    }
  }
}