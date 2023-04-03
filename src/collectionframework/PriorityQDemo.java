import java.util.*;
class Mycomp implements Comparator<Integer>
{
    public int compare( Integer o1, Integer o2)
    {
        if(o1<o2)return 1;
        if(o1>o2)return -1;
        return 0;
    }
}
public class PriorityQDemo {
    public static void main(String[] args)
    {
        PriorityQueue<Integer> pq = new PriorityQueue(new Mycomp());
        pq.add(10);
        pq.add(12);
        pq.add(40);
        pq.add(2);
        pq.add(0);
        pq.add(3);
        
        System.out.println(pq.peek());
        pq.forEach((x)->System.out.println(x));
        
        
        System.out.println(pq.poll());
        System.out.println("After Deletion");
        pq.forEach((x)->System.out.println(x));
    }
    
}
