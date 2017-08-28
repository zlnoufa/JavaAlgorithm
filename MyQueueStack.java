public class MyQueueStack<E>{
      Stack<E> instack=null;
      Stack<E> outstack=null;
      public MyQueueStack(){
         instack=new Stack<E>();
         outstack=new Stack<E>();
     }
      public boolean isEmpty(){
       if(instack.isEmpty()&&outstack.isEmpty()){
            return true;
        } 
        else{
         return false; 
       } 
      }
      public void push(E data){
        instack.push(data);
    }
    public E pop(){
       if(this.isEmpty())
         return null;
       if(outstack.isEmpty()){
           while(!instack.isEmpty()){
              E tmpData= instack.pop();
              outstack.push(tmpData);
           
          }
        
       }
       return outstack.pop(); 
   }
}
