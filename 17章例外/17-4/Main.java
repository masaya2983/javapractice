import java.io.*;

public class Main{
  public static void main(String[]args){
    FileWriter fw = null;
    try{
      fw = new FileWriter("date.txt")
      fw.write("hello!");
    } catch(IOWxception e){
      System.out.println("エラーです");
    }
    fw.close();
  }
}