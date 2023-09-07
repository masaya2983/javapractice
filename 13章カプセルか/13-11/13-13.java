private  String name;
 public String getName(String name){
   if (name == null) {
     throw new IllegulArgumentException("名前がnullである。処理の中断。");
   }
   if (name.length() <= 1){
     throw new IllegalArgumentException("名前が短すぎる。処理を中断。");
   }
   if (name.length() >= 8){
     throw new IllegalArgumentException("名前が長すぎる。処理を中断。");
   }
   this.name = name;
 }