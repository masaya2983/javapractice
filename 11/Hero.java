public class Hero extends Charcter {
  public void attack(Matango m){
    System.out.println(this,name + "の攻撃!");
    m.hp -= 10;
  }
}