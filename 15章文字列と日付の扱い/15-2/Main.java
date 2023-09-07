public class Main{
  public static void main(String[]args){
    String s1 = "Java and JavaScript";
    if (s1.countains("Java")){
      System.out.println("文字列ｓ1は、Javaを含んでいます");
    }
    if (s1.endsWith("Java")){
      System.out.println("文字列S1は、Javaが末尾にあります");
    }
    System.out.println("文字列S1で最初にJavaが登場する位置は" + s1.index("Java"));
    System.out.println("文字列S1で最後にJavaが登場する位置は" + s1.lastIndexof("Java"));
  }
}