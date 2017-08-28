interface NetWork{
   public abstract void browser();
 
}
class Real implements NetWork{
    public void browser(){
       System.out.println("已连接网络");
   }
   
}
class Proxy implements NetWork{
    NetWork network=null;
    public Proxy(NetWork network){
          this.network=network;
    }
    public void auth(){
         System.out.println("auth is start!!!");
    }
    public void browser(){
         auth();
         this.network.browser();
    }
}
