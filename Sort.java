public class Sort{
   public static void main(String args[]){
      

   }
   public static void sort(int a[],int mid){
      for(int i=0;i<mid-1;i++){
         if(a[i]>mid){
                int tmp=a[i];
                a[i]=a[mid];
                a[mid]=tmp;
                findRightPlaceForMid(a,mid);
         }
      }
 
   }
  public static void findRightPlaceForMid(int[] a,int mid){
    for(int i=mid;i<a.length;i++){
        if(a[i]<a[i+1]){
              tmp=a[i];
              a[i]=a[i+1];
              a[i+1]=tmp;

        }
    }
  }

}
