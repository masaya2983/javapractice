public class Main{
  public static void main (string[] args){
    int sansu = 20;
    int kokugo  = 30;
    int rika  = 40;
    int eigo  = 50;
    int shakai  = 80;
    
    int sum   = sansu + kokugo  + rika  + shakai  + eigo;
    
    int avg = sum / 5;
    System.out.println("合格点:"  + sum);
    System.out.println("平均点" + avg);
  }
}