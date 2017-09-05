public class Shift_K{
  public static void main(String args[]){
    int[] a={1,2,3,4,5,6,7,8,9};
    shift_K(a,2);
    for(int i=0;i<a.length;i++){
       System.out.println(a[i]);
     }       

  }
 public static void shift_K(int a[],int k)
{
   int n=a.length;
   k=k%n;
   reverse(a,n-k,n-1);
   reverse(a,0,n-k-1);
   reverse(a,0,n-1);  
}
public static void reverse(int a[],int left,int right){
     for(;left<right;left++,right--){
          int tmp=a[left];
          a[left]=a[right];
          a[right]=tmp;
       
    }             
 
  }
}

