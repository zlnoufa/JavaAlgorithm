public class SwapWords{
   public static void main(String args[]){

   }
   public static void swap(char a[],int start,int end){
     while(start<end){
        char tmp=a[end];
        a[end]=a[start];
        a[start]=tmp;
        start++;
        end--;
     }
 
   }
  public String swapString(String s){
     char[] sarr=s.toCharArray();
     swap(sarr,0,sarr.length-1);
     int j=0;
     for(int i=0;i<sarr.length;i++){
         if(sarr[i]==' '){
         swap(sarr,j,i-1);
         j+=1;   
        }
       }
       
     String newsarr=new String(sarr); 
     return newsarr;
 }
}


