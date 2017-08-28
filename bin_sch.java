//该函数实现二分查找，使用java语言，传递四个参数，int[] array,int low, int high,int key.使用递归模式实现
public static int binSch(int[] array,int low,int high,int key){
     int mid=null;
     mid=(low+high)/2;
     if(array[mid]==key){
       return mid;
     }else if(key<array[mid]){
        return binSch(array,low,mid,key);
}else{
     return binSch(array,mid,high,key);
}
}
