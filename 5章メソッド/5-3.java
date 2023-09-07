public class Main{
   public static void methodA (string[] args){
     System.out.println("methodA");
     methodB();
   }
    public static void methodB (string[] args){
     System.out.println("methodB");
    }
    public static void main (string[] args){
      methodA(); 
      
}