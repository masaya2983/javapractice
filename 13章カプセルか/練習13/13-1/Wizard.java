public class Wizard{
  private int hp;
  private int mp;
  private String name;
  private Wand wand;
  public void heal(Hero h){
    int basePoint = 10;
    int recoverPoint = (int) (basePoint * this.wand.power);
    h.setHp(h.get() + recoverpoint);
    System.out.println(h.getName + "のHPを" + recoverePoint + "回復した!");
  }
}