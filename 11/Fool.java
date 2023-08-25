public class Fool extends Charater implements Human{
  //Charaterからhpやnameなどフィールドを継承している
  //Charaterから継承した抽象メソッドattack()を実装
  public void attack (Matango m) {
    System.out.println(this.name + "は戦わず遊んでいる");
  }
  //さらにHumanから継承した4つの抽象メソッドを実装
  public void talok();
  public void watch();
  public void hear();
  
}