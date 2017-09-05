public class FindNotDouble{
public static void main(String args[]){
          int[] arr={1,2,3,2,4,3,5,4,1};
           System.out.println(findNotDouble(arr));
  }
 public static int findNotDouble(int a[]){
   int n=a.length;
   int result=a[0];
   int i;
   for(i=1;i<n;++i){
      result^=a[i];
   }
   return result;    
 }
}
