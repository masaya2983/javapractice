public class Main {
  public static void main(String [] args){
    Sword a = new Sword() ;
    a.name = "炎の剣";
    a.damage = 10;
    Hero h = new Hero();
    h.name = "みなと";
    h.hp = 100;
    h.sword = s;
    System.out.println("現在の武器は" + h.sword.name);
  }
}