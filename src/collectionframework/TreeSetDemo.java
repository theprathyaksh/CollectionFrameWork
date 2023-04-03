
import java.util.*;


public class TreeSetDemo {
     public static void main(String[] args)
    {
        TreeSet<Integer> ts = new TreeSet<>(List.of(10,20,30,40,50));
        
        ts.add(10);
        ts.add(48);
        ts.add(42);
        ts.add(13);
        ts.add(5);
        
        ts.forEach((x)->System.out.println(x));
        
    }
    
}
