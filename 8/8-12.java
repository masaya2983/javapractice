public class Main {
  public static void main(String[] args{
    //勇者を生成
    Hero h = new Hero();
    //フィールドを初期値をセット
    h.name = "ミナト";
    h.hp = 100;
    System.out.println("勇者" + h.name + "生み出しました！");
  }
}