import java.util.*;
import java.util.ArrayList;
import java.io.*;
public class TokenizerDemo {
    public static void main(String[] args)throws Exception
    {
        FileInputStream fis = new FileInputStream("C:\\Users\\theprathyaksh\\MyJava\\Array_list.txt");
        byte b[] = new byte [fis.available()];
        fis.read(b);
        String data = new String(b);
        
        //String data = "name=mbappe;address=hyderabad;country=china;dept=cse";
        
        StringTokenizer stk = new StringTokenizer(data,",");
        
        String s;
        ArrayList<Integer> al = new ArrayList<>();
        while(stk.hasMoreTokens())
        {
            s = stk.nextToken();
            al.add(Integer.valueOf(s));
        }
        System.out.println(al);
    }
    
}
