import java.util.*;

//illustration of iterator method of accessing map entries
public class HashMap2 {
    public static void main(String[] args)
    {
        HashMap <String,Double> hmap = new HashMap <String,Double>(); //defines new HashMap
        hmap.put("M",new Double(5.5)); //inserts key and value
        hmap.put("T",new Double(9.5));
        hmap.put("Z",new Double(7.4));
        hmap.put("P",new Double(32.5));
        
        Collection c = hmap.entrySet();
        Iterator iter = c.iterator(); //defining iterator
        while(iter.hasNext()) //output of key-value pairs
        {
            Object object = iter.next();
            if(object == null)
                System.out.println("null");
            else
                System.out.println(object.toString());
        }
            
    }
    
}
