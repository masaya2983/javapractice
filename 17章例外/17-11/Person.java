public class Person{
  int age;
  public void setAge(int age){
    if (age < 0){ //ここで因数をチェック
     throw new IlleagalArgumentException("年齢は0以上の数を指定すべきです。指定地=" + age);
      
    }
    this.age = age; //問題ないなら、フィールドに値をセット
  }
}