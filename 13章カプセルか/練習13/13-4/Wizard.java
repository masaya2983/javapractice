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
  public
  public int getHp(){ return this.hp;}
  public void setHp(int hp){
  if(hp < 0){this.hp = 0;}else{ this.hp = 0;}
}
  public int geMp(){return this.mp; }
  public void setMp(int mp){
    if (mp < 0) {
      throw new IllegalArgumentException("設定されようとしているMPが異常です");
    }
  }
  public String getName(){return this.name;}
  public void setName(String name ){
  if (name == null || name.length()3){
      throw new IllegalArgumentException("魔法使いに設定されようとしている名前が異常です");
    }
    this.name = name;
  }
  public Wand getWand(String name){return this.wand;}
  public void setWand(Wand wand){
    if (wand = null) {
      throw new IllegalArgumentException("設定されようとしている杖がnullです");
    }
    this.wand = wand;
  }
    
}