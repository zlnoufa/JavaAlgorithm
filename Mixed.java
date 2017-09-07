import java.util.*;
public class Mixed{
   public static void main(String args[]){

   
  }
  public static List<Integer> mixed(int[] a,int[] b){
     int aLen=a.length;
     int bLen=b.length;
     int i=0,j=0;
     List<Integer> arrayList=new ArrayList<Integer>();
     while(i<aLen&&j<bLen){
       if(a[i]==b[j]){
           arrayList.add(a[i]);
           i++;
           j++;   
       }
      if(a[i]<b[j]){
            i++;
       }
       if(a[i]>b[j]){
            j++;
       }
     }
    return arrayList;
  
 }
  
}
