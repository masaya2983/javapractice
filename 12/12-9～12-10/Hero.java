public class Hero extends Character {
  public void attack(Moster m){
    System.out.println(this.name + "の攻撃!");
    System.out.println("敵に１０ポイントのダメージをあたえた");
    m.hp -= 10;
  }
  
}