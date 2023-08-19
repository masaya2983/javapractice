package calcapp.main;

public class Calc {
  public static void main(String[] arg){
    int a = 10; int b = 2;
    int total = calcapp.Logic.tasu(a,b);
    int delta = calcapp.Logics.hiku(a,b);
    System.outprintln("足すと" + total + ".引くと" + delta);
  }
}