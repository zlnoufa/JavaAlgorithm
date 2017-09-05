public class MaxSubArr{
public static int maxSubArr(int[] arr){
  int tmpMax=0;
  int max=Integer.MIN_VALUE;
  for(int i=0;i<arr.length;i++){
      tmpMax+=arr[i];
      if(tmpMax<0){
         tmpMax=0; 
      }
      if(tmpMax>max){
        max=tmpMax;                   
     }
 }
 return max;
  

}
public static void main(String args[]){
    int[] arr={1,-2,4,8,-4,7,-1,-5};
    System.out.println(maxSubArr(arr));
 }
}
