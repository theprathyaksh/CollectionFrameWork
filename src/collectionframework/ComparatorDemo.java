import java.util.*;
class my implements Comparator<Integer>
{
    public int compare(Integer i1, Integer i2)
    {
        if(i1<i2)
            return 1;
        if(i1>i2)
            return -1;
        return 0;
    }
}
public class ComparatorDemo {
    public static void main(String[] args)
    {
        Integer a[] = {2,4,6,8,1,3,5,7};
        
        
        Arrays.sort(a, new my());
        for(int x:a)
            System.out.println(x);
        
        //int b[] = {2,4,6,8,1,3,5,7};
        
        /*int c[] = Arrays.copyOf(a,4);
        
        for(int x:c)
            System.out.println(x);
        
        System.out.println(Arrays.compare(a,b)); */
        
        
    }
    
}
