import java.util.Arrays;
public class IsSameComponent{
   public static void main(){
   
   }
   public static void isSameComponent(String a,String b){
      char[] aarr=a.toCharArray();
      char[] barr=b.toCharArray();
      Arrays.sort(aarr);
      Arrays.sort(barr);
      String newa=new String(aarr);
      String newb=new String(barr);
      newb=new String(barr);
      if(newa==newb){
          System.out.println("相同");
      }else{
         System.out.println("不相同");
       }  
   }
 
}
