import java.util.*;
import java.io.*;
public class PropertyDemo {
    public static void main(String[] args)throws Exception 
    {
        Properties p = new Properties();
        
        /*p.setProperty("Brand","Dell");
        p.setProperty("Processor", "i7");
        p.setProperty("os", "Windows 10");
        p.setProperty("Model", "Latitude");
        
        p.storeToXML(new FileOutputStream("C:\\Users\\theprathyaksh\\MyJava\\property.xml"),"Laptop");
        */
        
        p.loadFromXML(new FileInputStream("C:\\Users\\theprathyaksh\\MyJava\\property.xml"));
        System.out.println(p.getProperty("os"));
    }
    
}
