public class Compuiter extends TangibleAsset{
  String makerName;
  public Computer(String namke, int price, String color, String makeName){
    super(name, price, color );
    this.makerName = makeName;
  }
  public String getMakerName() {return this.makeName;}
}