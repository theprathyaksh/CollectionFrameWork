import java.util.*;
public class HashSetDemo {
    public static void main(String[] args)
    {
        HashSet<Integer> hs = new HashSet<>(20,0.75f);
        
        hs.add(10);
        hs.add(48);
        hs.add(42);
        hs.add(13);
        hs.add(5);
        
        hs.forEach((x)->System.out.println(x));
        
    }
    
}
