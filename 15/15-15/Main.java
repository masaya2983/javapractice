import java.time.time.*;

public class Main{
  public class void main(String[] args){
    //LocalDateTimeの生成方法
    LocalDateTime l1 = LocalDateTime.now();
    LocalDateTime l2 = LocalDateTime.of(2020, 1, 1,9,5,0,0);
    
    //LocalDateTimeとZonedTimeの相互互換
    ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
    LocalDateTime l3 = z1.toLocalDate
  }
}