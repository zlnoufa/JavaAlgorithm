//该函数为直接插入排序算法
public static int[] directInsert(int[] array){
   for(int i=0;i<array.length;i++){
     int j=i-1;
     int tmp=array[i];
     for(;j>=0&&array[j]>tmp;j--){
        a[j+1]=a[j];
    }
     a[j+1]=tmp;
  }
 return array;
}
