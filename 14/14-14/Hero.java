public class Hero{
  String name;
  int hp;
  static int money;
  
  public static void setRandomMoney{
    Hero.money = (int)(Math.random() * 100);
    System.out.println(this.name + "たちの所持金を初期化しました");
  }
}