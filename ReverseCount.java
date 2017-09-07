public class ReverseCount{
   public static void main(String args[]){
      int array[]={1,5,3,2,6};
      System.out.println(reverseCount(array));   
                 
   }
   public static int reverseCount(int a[]){
     int count=0;
     int aLen=a.length;
     for(int i=0;i<aLen;i++){
        for(int j=i+1;j<aLen;j++){
           if(a[i]>a[j]){
                count+=1;
          }
 
        }
                        
     }
    return count;

  }
}
