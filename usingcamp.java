
import java.util.Arrays;
import java.util.Comparator;
class camp implements Comparator<Animal>{
    @Override
    public  int compare(Animal a1,Animal a2){
        if (a1.age==a2.age) {
            return a1.name.compareTo(a2.name);
        }
         return Integer.compare(a1.age, a2.age);
    }
}
public class usingcamp{
    public static void main(String[] args) {
        int a[][]={{6,7,5},{3,8,9},{1,3,5},{1,2,6}};
      for (int e[] : a) {
          for (int elem : e) {
              System.out.print(elem + " ");
          }
      }
      Arrays.sort(a,(s1,s2)->{
        if (s1[0]==s2[0]) {
            return s1[1]-s2[1];
        }
        if (s1[0]==s2[0]) {
            return s1[2]-s2[2];
        }
       return s1[0]-s2[0];
      });
      System.out.println(" ");
      for (int e[] : a) {
          for (int elem : e) {
              System.out.print(elem + " ");
          }
      }
        
    }
}