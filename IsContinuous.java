public class IsContinuous{
   public static void main(String args[]){
        int array[]={8,7,5,0,6};
        if(isContinuous(array)){
             System.out.println("aaa");
       }
   } 
   public static boolean isContinuous(int a[]){
     int aLen=a.length;
     int min,max;
     min=max=a[0];
     for(int i=0;i<aLen;i++){
        if(a[i]!=0){
           if(a[i]<min){
              min=a[i];
         }
          if(a[i]>max){
             max=a[i];
         }
         
      }
     }
     if(max-min>aLen-1){
        return false;
     }else{
         return true;
     }
   }

}
