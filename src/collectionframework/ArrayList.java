import java.util.ArrayList;
import java.util.*;
public class ArrayList {
    public static void main(String[] args)
    {
        ArrayList<Integer> al1 = new ArrayList<>(20);
        ArrayList<Integer> al2 = new ArrayList<>(List.of(50,60,70,80,70));
        
        al1.add(10);
        al1.add(0,5);
        
//        al1.addAll(1,al2);
//        System.out.println(al1.containsAll(al2));
//        System.out.println(al1.get(2));
//        System.out.println(al1.set(2, 30));
//        System.out.println(al1.lastIndexOf(70));
//        System.out.println(al1);
//        System.out.println(al1.indexOf(10));
        
       Iterator<Integer> it = al1.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
  

          //al1.forEach(n->System.out.println(n));
      }
        
//        for(ListIterator<Integer> it = al1.listIterator();it.hasNext();)
//        {
//            System.out.println(it.next());
//        }
        
//            al1.forEach(n->show(n));
        
        
    }
//    static void show(int n)
//    {
//        if(n>60)
//        {
//            System.out.println(n);
//        }
//    }
//    
}
