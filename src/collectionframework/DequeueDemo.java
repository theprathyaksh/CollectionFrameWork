import java.util.*;
public class DequeueDemo {
    public static void main(String[] args)
    {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offerLast(20);
        dq.offerLast(40);
        dq.offerLast(50);
        dq.offerLast(60);
        
        dq.offerFirst(1);
        dq.offerFirst(2);
        dq.offerFirst(3);
        dq.offerFirst(4);
        
        dq.forEach((x)->System.out.println(x));
        
    }
    
}
