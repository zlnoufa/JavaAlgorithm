public class Test{
   public static boolean isPower(int n){
      if(n<1){
      return false;
      }
      int i=1;
      while(n>i){
         i<<=1;
        if(i==n){
          return true;
        }
      }
      return false;
   }
   public static boolean isPower(int n,int i){
          if(n<1){
          return false;  
        }
       int m=n&(n-1);
       return m==0;
        
  }
   public static void main(String args[]){
       System.out.println(isPower(6));
       System.out.println(isPower(4,1));
   }
}
