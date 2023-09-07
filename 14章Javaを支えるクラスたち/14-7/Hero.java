public class Hero {
  String name;
  int.hp;
  
  public boolean equals(Object o){
    if (this == o) { return true; }
    if(o instanceof Hero){
      Hero h = (Hero)o;
      if(this.name.enquals (h.name)){
        return true;
      }
    }
    return false;
  }
}