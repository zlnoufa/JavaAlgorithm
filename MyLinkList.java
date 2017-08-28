import java.util.Set;
import java.util.HashSet;
class MyLinkList{
  Node head=null;
  Node last=head;
  public MyLinkList(){
     System.out.println("创建链表成功！！！");
   }
  public void addNode(int data){
     Node newnode=new Node(data);
     if(head==null){
        head=newnode;
        last=newnode;
    }else{
         last.next=newnode;
         last=newnode;
    }    
  }
  public boolean deleteNode(int index){
    if(index<1 || index>length()){
     return false; 
  }
   if(index==1){
   head=head.next;
   }
   int i=2;
   Node preNode=head;
   Node curNode=head.next;
   while(curNode!=null){
     if(i==index){
       preNode=curNode.next;
       return true;
    }
     preNode=curNode;
     curNode=curNode.next;
     i++;
   
   }
   return false;
  }
  public boolean insertNode(int index){
    return false;
  }
  public int length(){
    int length=0; 
    Node tmp=head;
    while(tmp!=null){
       tmp=tmp.next;
       length++;
    }
    return length;
   }
  public void print(){
    Node printPointer=head;
    while(printPointer!=null){
         System.out.println(printPointer.data);       
         printPointer=printPointer.next;
      }  
  }
  public void sort(){
    if(head!=null&&head.next!=null){
        Node curNode=head;
        while(curNode!=null){
           Node nextNode=curNode.next;
           while(nextNode!=null){
             if(nextNode.data<curNode.data){
                 int tmp=curNode.data;
                 curNode.data=nextNode.data;
                 nextNode.data=tmp;               
              }
            nextNode=nextNode.next;
           }
          curNode=curNode.next; 
       }
   }
 }
 public void deleteDuplicate(){
     Set<Integer> set=new HashSet<Integer>();
     Node tmp=head;
     Node preNode=null;
     while(tmp!=null){
       if(set.contains(tmp.data)){
        preNode.next=tmp.next; 
       }else{
       set.add(tmp.data);
       preNode=tmp;
       }
       tmp=tmp.next;
    }     
  }
  public void deleteDuplicate(String name){
     Node p=head;
     while(p!=null){
       Node q=p.next;
       while(q!=null){
         if(p.data==q.data){
          p.next=q.next;
          q=q.next;
       }else{
             
      
    }
    p=p.next;
    }
  }
 }
  public Node findElem(int k){
      if(k<1){
       return null;
       }
      Node p1=head;
      Node p2=head;
      while(k>1&&p1!=null){
      p1=p1.next;
      k--;
    }
    if(p1==null){
       return null;
    }
    while(p1.next!=null){
        p1=p1.next;
        p2=p2.next;
    }
   return p2;   
  }
  public Node reverseNode(){
     
    Node pNode=head;
    Node pPrev=null;
    Node newHead=null;
    while(pNode!=null){
       Node pNext=pNode.next;
       if(pNext==null){
          newHead=pNode;
       }
       pNode.next=pPrev;
       pPrev.next=pNode;
       pNode=pNext;
    
    }
   return newHead;
  }
  public void reversePrint(Node head){
    Node tmp=head;
    while(tmp!=null){
       reversePrint(tmp.next);
       System.out.println(tmp.data);
   }

  }
  public Node searchMid(Node head){
     Node p=head;
     Node q=head;
     while(p!=null&&p.next!=null&&p.next.next!=null){
         p=p.next.next;
         q=q.next;   
    }
    return q;
  }
  public boolean isLoop(){
     Node fast=head;
     Node slow=head;
     while(fast!=null&&fast.next!=null){
         fast=fast.next.next;
         slow=slow.next;
         if(fast==slow){
           return true;
         }
       
     }
     return !(fast==null||fast.next==null);
  }
  public Node FindLoopPoint(){
     Node fast=head;
     Node slow=head;
     while(fast!=null&&fast.next!=null){
         fast=fast.next.next;
         slow=slow.next;
         if(slow==fast)
              break;
     }
     if(fast==null||fast.next==null){
     return null;
    }
    slow=head;
    while(fast!=slow){
       slow=slow.next;
       fast=fast.next;
    }
    return slow;
  }
  public boolean deleteNode(Node n){
     if(n==null ||n.next==null){
     return false;
   }
   n.data=n.next.data;
   n.next=n.next.next;
   return true;
   }
   public boolean isIntersect(Node h1,Node h2){
       while(h1==null||h2==null)
          return false;
      while(h1.next!=null)
        h1=h1.next;
      while(h2.next!=null)
        h2=h2.next;
      return h1==h2;
  }
  public Node getFirstMeetNode(Node h1,Node h2){       
    if(h1==null ||h2==null){
     return null;
    }
    Node tail1=h1;
    Node tail2=h2;
    int h1len=0;
    int h2len=0;
    while(tail1.next!=null)
      tail1=tail1.next;
       h1len++;
    while(tail2.next!=null)
      tail2=tail2.next;
      h2len++;
  
  if(tail1!=tail2)
     return null;
  Node t1=h1;
  Node t2=h2;
  if(h1len>h2len){
       int d=h1len-h2len;
       while(d>0){
           t1=t1.next;
           d--;
      }
    }
   else{
         int d=h2len-h1len;
         while(d>0){
             t2=t2.next;
             d--;
       }
   }
  
  
  while(t1!=t2){
    t1=t1.next;
    t2=t2.next;
  }
  return t1;
}
}
