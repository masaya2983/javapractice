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
    ZonedDateTime z2 = ZonedDateTime.of(2020, 1, 2, 3, 4, 5, 6,zoneId.of("Asia/Tokyo"));
    
    //InstantとZonedDateTime
    Instant i3 = Z2.toInstant();
    ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/Lo0ndon"));
    //ZonedTimeの利用方法
    System.out.println("東京:" + z2.getYear() + z2.getMonth());
    System.out.println("ロンドン:" + z3.ghetYear() + z3.getMonth() + z3.getDayofMonth());
    if(z2.isEqual(z3)){
      System.out.printl("これらは同じ瞬間を指しています");
    }
  }
}