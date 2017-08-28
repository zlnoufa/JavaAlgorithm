interface Window{
  public abstract void open();
  public abstract void close();
  public abstract void min();
  public abstract void max();
}
class WindowAdapter implements Window{
   public void open(){}
   public void close(){}
   public void min(){}
   public void max(){}
  
}
class WindowImpl extends WindowAdapter{
   public void open(){
     System.out.println("窗口已打开");
   }
   public void close(){
     System.out.println("窗口已关闭"); 
  }
}
