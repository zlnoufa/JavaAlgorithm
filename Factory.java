interface Fruit{
 public abstract void eat(); 
}
class Apple implements Fruit{
 public void eat(){
    System.out.println("eat apple!");
 }  
}
class Orange implements Fruit{
  public void eat(){
     System.out.println("eat orange");
  }
}
class Factory{
      public static Fruit getInstance(String classname){
         Fruit f=null;
         if("orange".equals(classname)){
           f=new Orange(); 
         }
         if("apple".equals(classname)){
            f=new Apple(); 
         }
         return f;
   }
}

