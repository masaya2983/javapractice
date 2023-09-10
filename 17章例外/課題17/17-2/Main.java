public class Main{
  public static void main(String[]args{
    String s = null;
    System.out.println(s.length());
  } catch (NullPointerException e) {
    System.out.println("NullPointerException e"){
      System.out.println("NullPointerException例外をcstchしました");
      System.out.println("－－スタックトレース(ここから)－－");
      e.printStackTrace();
      System.out.println("－－スタックトレース(ここまで)");
    }
  }
}