//此函数是java冒泡排序算法，输入为单个数组
public static int[] bubbleSort(int[] array){
     for(int i=0;i<array.length-1;i++){
       for(int j=0;j<array.length-i-1;j++){
        if(array[j]>array[j+1]){
            int tmp=array[j];
            array[j]=array[j+1];
            array[j+1]=tmp;
   }
   return array;
  }
}
}
