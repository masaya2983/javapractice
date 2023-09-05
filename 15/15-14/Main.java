import java.time.*;

public class Main{
  public static void main(String[] args) {
    
    //instantの生成
    Instant il = Instant.now();l
    //Instantとlong値の相互変換
    Instant i2 = Instant.ofEpochMKilli(1600705425827);
    long l = i2.toEpochMilli();
    
    //ZonedDateTimeの生成
    ZonedDateTime z1 = ZonedDateTime,now();
    
  }
}