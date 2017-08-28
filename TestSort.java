public class TestSort{
   public static void selectSort(int a[]){
     
     for(int i=0;i<a.length;i++){
       int min=a[i];
       int index=i;
       for(int j=i+1;j<a.length;j++){
          if(a[j]<min){
            min=a[j];
            index=j;
          }
       }
       if(index!=i){
          int tmp=a[i];
          a[i]=a[index];
          a[index]=tmp;
       }
     }
   }
   public static void insertSort(int a[]){
     int len=a.length;
     for(int i=1;i<len;i++){
       if(a[i]<a[i-1]){
          int tmp=a[i];
          int j=i-1;
          while(j>=0&&a[j]>tmp){
             a[j+1]=a[j];
             j--;
         }
         a[j+1]=tmp;
       }
    }
}
  public static void BubbleSort(int a[]){
         for(int i=0;i<a.length-1;i++){
           for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                   int tmp=a[j];
                   a[j]=a[j+1];
                   a[j+1]=tmp;
               }
            }
        }
   
   }
   public static void main(String args[]){
     int[] a={5,4,9,8,7,6,0,1,3,2};
     BubbleSort(a);
     for(int i=0;i<a.length;i++){
       System.out.println(a[i]);
     }
   }

}
