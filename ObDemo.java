import java.util.Observable;
import java.util.Observer;
class House extends Observable{
   Float price=10000f;
   public House(Float price){
     this.price=price;
   }
   public Float getPrice(){
     return this.price;
    }
   public void setPrice(Float price){
     this.price=price;
     super.setChanged();
     super.notifyObservers(price);
   }
   
}
class HouseWatcher implements Observer{
   String name;
   public HouseWatcher(String name){
      this.name=name;
   }
   public void update(Observable o,Object arg){
     if(arg instanceof Float){
        System.out.println("房价改变了："+((Float) arg));
    }
   }
  
 
}

public class ObDemo{
     public static void main(String args[]){
       House h=new House(10000f);
       HouseWatcher hw1=new HouseWatcher("alice");
       HouseWatcher hw2=new HouseWatcher("bob");
       HouseWatcher hw3=new HouseWatcher("crack");
       h.addObserver(hw1);
       h.addObserver(hw2);
       h.addObserver(hw3);
       h.setPrice(8888.0f);    
   }
}
