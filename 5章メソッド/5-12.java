public class Main{
  //int型の配列を受け取り、すべての要素を表示するメゾット
  public static void print Array(int[] array){
    for (int element : array){
      System.out.println(element);
    }
  }
  public static void main(String[] args){
    int [] array = {1, 2, 3};
    printArray(array); //配列を渡す
  }
}