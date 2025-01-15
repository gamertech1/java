class Base{
   
       public int addnum(int a,int b){
       return a+b;
    }
    
}
class Root extends Base{
   @Override
       public int addnum(int a, int b){
       return a+b+1;
    }     
 }
public class main1 {
    public static void main(String[] args) {
      Root b1 = new Root();
      System.out.println(b1.addnum(5,6));
    }
    }