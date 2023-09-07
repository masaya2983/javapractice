public class PoisonMatango extends Matango{
  int poisonCount
  public PoisonMatango (char suffix){
    supper(suffix);
    
  }
  public void attack(Hero h){
    supper.attack(h);
    if (this.PoisonCount > 0){
      System.out.println("さらに毒の胞子をばらまいた！");
      int dmg = h.hp / 5;
      h.hp -= dmg;
      System.out.println(dmg + "ポイントのダメージ！");
      this.poisonCount--;
    } 
    
  }
}