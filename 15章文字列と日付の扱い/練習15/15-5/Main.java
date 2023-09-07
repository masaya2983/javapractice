import java.time.*;
import java.time.format.DateTimeFormatter;
public class Main{
  public static void main(String[] args){
    LocalDate now = LocalDate.now();
    LocalDate future = now.plusDays(100);
    DateTimeFormatter fmt = DateTimeFormatter.ofpattern("西暦yyyy年MM月dd日");
    System.out.println(future.format(fmt));
  }
}