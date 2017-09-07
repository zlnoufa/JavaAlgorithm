public class WordCount{
    public static void main(String args[]){
       String a="I am OK zz";
       System.out.println(wordCount(a));    
    }
    public static int wordCount(String helloworld){
       int count=0;
       int word=0;
       char[] tca=helloworld.toCharArray();
       for(int i=0;i<tca.length;i++){
         if(tca[i]==' '){
            word=0;
        }else{
          if(word==0){
              word=1;
              count++;}
        }
       }
      return count;
   }

}
