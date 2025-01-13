
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
       Map<Integer,String>m1= new HashMap<>();
       m1.put(4, "main");
       m1.put(3, "dev");
       m1.put(2, "main1");
       m1.put(2, "prod");
       m1.putIfAbsent(1, "main1");
       System.out.println(m1);
       for(Map.Entry<Integer,String>elem : m1.entrySet()){
        System.out.print(elem.getKey() + " ");
        System.out.println(elem.getValue());
       }
       for(Integer s1 : m1.keySet()){
        System.out.print(s1 + " ");
       }
       for(String s2 : m1.values() ){
        System.out.print(s2 + " ");
       }

} 
}