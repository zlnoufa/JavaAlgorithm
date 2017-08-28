public class Stack1{
      Stack<Integer> ele=null;
      Stack<Integer> min=null;
      public Stack1(){
         ele=new Stack<Integer>();
         min=new Stack<Integer>();
     }
    public int pop(){
       int topData=ele.peek();
       ele.pop();
       if(topData==this.min()){
           min.pop();
      }
      return topData;
    }
    public void push(int data){
       ele.push(data);
       if(min.isEmpty())
          min.push(data);
       else{
 
         if(data<min.peek())
              min.push(data);
       }
          
   }
   public int min(){
      if(this.min.isEmpty()){
           return Integer.MAX_VALUE;
       }
      return this.min.peek();
  }
 

}
