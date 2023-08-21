public class Wizard{
  String name;
  int hp;
  public void main (Hero h) {
    h.hp += 10;
    System.out.println(h.name + "のHPを10回復した!");
  }
}