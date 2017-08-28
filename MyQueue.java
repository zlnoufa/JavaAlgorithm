class Node<E>{
    E data;
    Node<E> next=null;
    public Node(E data){
      this.data=data;
   }
}
public class MyQueue{
    Node<E> head=null;
    Node<E> tail=null;
    public boolean isEmpty(){
       if(head==null){
         return true;
      }
      return false;
    }
    public void put(E data){
      Node<E> newNode=new Node<E>(data);
      if(this.isEmpty()){
         head=newNode;
         tail=newNode;
       }else{
       tail.next=newNode;
       tail=newNode;
      }
   }
   public E pop(){
        if(this.isEmpty()){
           return null;
       }
       E retData=head.data;
       head=head.next;
       return retData;
    }
   public int size(){

   }
  
}
