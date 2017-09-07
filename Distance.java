public class Distance{
public static void main(String args[]){


}
public static int minDistance(int[] a,int x,int y){
    int aLen=a.length;
    int x_index=-1;
    int y_index=-1;
    int mindist=0;
    for(int i=0;i<aLen;i++){
       if(a[i]==x){
           x_index=i;
           if(y_index>=0){
               mindist=mindist>(Math.abs(x_index-y_index))?Math.abs(x_index-y_index):mindist;

            }
       
       }
       if(a[i]==y){
            y_index=i;
            if(y_index>=0){
              indist>(Math.abs(x_index-y_index))?Math.abs(x_index-y_index):mindist;
            }
      }
    }
   return mindist;
}

}
