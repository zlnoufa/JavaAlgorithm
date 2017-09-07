public class FindIndex{
   public static void main(String args[]){

   }
   public static int finIndex(int[] a,int param){
    int aLen=a.length;
    int i=0;
    while(i<aLen){
         if(a[i]==param){
           return i;
 
        }else{
           i=i+abs(a[i]-param);
        }
           
    }
   return -1;
 }

}
