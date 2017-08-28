class Node<E>{
  E data;
  Node<E> next=null;
  public Node(E data){
    this.data=data; 
  }
}
public class Stack<E>{
  private Node<E> top;
  public boolean isEmpty(){
     if(top==null){
        return true;
     }
     return false;
   }
   public E peek(){
      if(isEmpty()){
           return null;
     }
     return top.data;
  }
  public E pop(){
    if(isEmpty()){
      return null;
    }
    E data=top.data;
    top=top.next;
    return data;
  }
  public void push(E data){
     Node<E> tmp=new Node<E>(data);
    tmp.next=top;
    top=tmp;
  }

}
