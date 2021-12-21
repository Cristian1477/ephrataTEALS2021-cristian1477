public class practice{
   public static void main(String[] args){
       String book = "Building Java Programs";
       int start = book.indexOf(" ") + 1;
       System.out.println(start);
       String test = book.substring(start, 13);
       System.out.println(test);
   } 
}