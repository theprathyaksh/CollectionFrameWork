import java.util.*;
import java.util.Map.*;
public class MapDemo {
    public static void main(String[] args)
    {
//        TreeMap<Integer,String> tm = new TreeMap<>(Map.of(78,"A",34,"*",56,"%",89,"k"));
//        tm.put(4,"E");
//        tm.put(5, "L");
//        
//        Entry<Integer,String> e = tm.firstEntry();
//        System.out.println(e.getKey()+" "+e.getValue());
//        
//        System.out.println(tm.ceilingEntry(3).getValue());
//        System.out.println(tm);
        
        
        LinkedHashMap<Integer,String> tm = new LinkedHashMap<>(Map.of(78,"A",34,"*",56,"%",89,"k"));
        tm.put(4,"E");
        tm.put(5, "L");
        
        //Entry<Integer,String> e = tm.firstEntry;
        //System.out.println(e.getKey()+" "+e.getValue());
        
        System.out.println(tm.get(34));
        System.out.println(tm);
        System.out.println(tm.hashCode());
        System.out.println(tm.keySet());
    }
    
}
