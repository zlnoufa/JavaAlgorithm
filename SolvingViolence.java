public class SolvingViolence{
   public static void main(String args[]){
    int a[]={3,4,5,7};
    int b[]={10,12,14,16,17};
    int c[]={20,21,23,24,37,30};
    System.out.println(solvingViolence(a,b,c));
   }
  public static int max(int a,int b,int c){
          int max=a>b?a:b;
          max=max>c?max:c;
          return max;
  }
  public static int solvingViolence(int a[],int b[],int c[]){
        int aLen=a.length;
        int bLen=b.length;
        int cLen=c.length;
        int tmpResult=0;
        int result=max(Math.abs(a[0]-b[0]),Math.abs(b[0]-c[0]),Math.abs(a[0]-c[0]));
        for(int i=0;i<aLen;i++){
             for(int j=0;j<bLen;j++){
                 for(int k=0;k<cLen;k++){
                    tmpResult=max(Math.abs(a[i]-b[j]),Math.abs(a[i]-c[k]),Math.abs(b[j]-c[k]));
                    if(tmpResult<result)
                        result=tmpResult;
                 }

            }
        }
        return tmpResult;
  }

}
