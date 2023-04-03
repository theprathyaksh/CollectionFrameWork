import java.util.*;
public class LinkedHashMapDemo {
    public static void main(String[] args)
    {
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>(5,.75f,true){
            protected boolean removeEldestEntry(Map.Entry e)
            {
                return size()>5;
            }
        };
        
        lhm.put(34,"R");//least recently accessed
        lhm.put(3,"*");
        lhm.put(19,"LK");
        lhm.put(1,"A");
        lhm.put(9,"Q");
        
        String s = lhm.get(3);
        s = lhm.get(19);
        s = lhm.get(9);
        
        lhm.put(6,"F" );
        
        lhm.forEach((x,z)->System.out.println(x+" "+z));
    }
    
}
