import java.util.Arrays;
public class MyStack<E>{
   private Object[] stack;
   private int size;
   public MyStack(){
      stack=new Object[10];
  }
  //判断stack是否为空
  public boolean isEmpty(){
    return size==0;
  }
  //输出stack顶部元素
  public E peek(){
     if(isEmpty())
       return null;
     return(E) stack[size-1];
   }
   public E pop(){
     E e=peek();
     stack[size-1]=null;
     size--;
     return e;
   }
   public void push(E item){
     ensureCapacity(size+1);
     stack[size++]=item;
     
   }
  private void ensureCapacity(int size){
     int len=stack.length;
     if(size>len){
        Arrays.copyOf(stack,10);
    }
  }
}
