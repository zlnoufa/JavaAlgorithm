public class SecondMax{
   public static int SecondMax(int[] arr){
     int FirstMax=arr[0];
     int SecondMax=arr[0];
     for(int i=1;i<arr.length;i++){
          if(arr[i]>FirstMax){
             if(FirstMax>SecondMax){
              SecondMax=FirstMax; 
             }
             FirstMax=arr[i];
          }else{
               if(arr[i]>SecondMax){
                 SecondMax=arr[i];
              }
           }
     }
     return SecondMax;     
   }
   public static void main(String args[]){
     int[] arr={7,3,19,40,4,7,1};
     System.out.println(SecondMax(arr));
    }
}
