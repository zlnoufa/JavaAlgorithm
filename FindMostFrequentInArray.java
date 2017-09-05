import java.util.*;
public class FindMostFrequentInArray{
   public static int findMostFrequentInArray(int[] arr){
      Map<Integer,Integer> m=new HashMap<Integer,Integer>();
      for(int i=0;i<arr.length;i++){
           if(m.containsKey(arr[i])){
               m.put(arr[i],m.get(arr[i])+1);
          }else{
              m.put(arr[i],1);
          }
      }
      int result=0;
      int most=0;
      Iterator iter=m.entrySet().iterator();
      while(iter.hasNext()){
        Map.Entry me=(Map.Entry)iter.next();   
        int key=(Integer)me.getKey();
        int value=(Integer)me.getValue();
        if(value>most){
          most=value;
          result=key;
       }
      }
      return result;
       
   }
   public static void main(String[] args){
     int arr[]={1,5,4,3,4};
     System.out.println(findMostFrequentInArray(arr));
  }

}
