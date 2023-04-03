import java.util.*;
import java.io.*;
class Account implements Serializable
{
    long AccoutNumber;
    String AccountName;
    Double AccountBalance;
    
    Account(long AccountNumber,String AccountName , Double AccountBalance)
    {
        this.AccoutNumber = AccoutNumber;
        this.AccountName = AccountName;
        this.AccountBalance = AccountBalance;
    }
    public String toString()
    {
        return "Account Number: "+AccoutNumber+"Name: "+AccountName+"Balance: "+AccountBalance;
    }
}
public class MenuDriven {
    public static void main(String[] args)throws Exception
    {
        Scanner sc = new Scanner(System.in);
        Account acc = null;
        HashMap<Long,Account> hm = new HashMap<Long,Account>();
        
        try{
        FileInputStream fis = new FileInputStream("C:\\Users\\theprathyaksh\\MyJava\\Accounts.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        int count = ois.readInt();
        for(int i =0;i<count;i++)
        {
            acc = (Account)ois.readObject();
            System.out.println(acc);
            hm.put(acc.AccoutNumber,acc);
        }
        fis.close();
        ois.close();
    }
        catch(Exception e) {}
        
        
        FileOutputStream fos = new FileOutputStream("C:\\Users\\theprathyaksh\\MyJava\\Accounts.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        System.out.println("--------------MENU-----------");
        int choice;
        long AccountNumber;
        String AccountName;
        double AccountBalance;
        
        do
        {
            System.out.println("Enter option: ");
            System.out.println("1.Create Account");
            System.out.println("2.Delete Account");
            System.out.println("3.View Account");
            System.out.println("4.View All Accounts");
            System.out.println("5.Save Accounts");
            System.out.println("6.Exit");
            choice = sc.nextInt(); 
            
            sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            
            switch(choice)
            {
                case 1: System.out.println("Enter Account Details: Account_no, name, balance ");
                        AccountNumber = sc.nextLong();
                        AccountName = sc.next();
                        AccountBalance = sc.nextDouble();
                        acc=new Account(AccountNumber,AccountName,AccountBalance);
                        hm.put(AccountNumber, acc);
                        System.out.println("Account Created for "+AccountName);
                        break;
                        
                case 2: System.out.println("Enter Account Number: ");
                        AccountNumber = sc.nextLong();
                        hm.remove(AccountNumber);
                        break;
                case 3: System.out.println("Enter Account Number: ");
                        AccountNumber = sc.nextLong();
                        acc = hm.get(AccountNumber);
                        System.out.println(acc);
                        break;
                case 4: 
                        for(Account a:hm.values())
                            System.out.println(a);
                        break;
                case 5:
                        
                case 6:  oos.writeInt(hm.size());
                
                        for(Account a:hm.values()) 
                            oos.writeObject(a);
                
            }
            
        }while(choice!=6);
                oos.flush();
                oos.close();
                
                fos.close();
    }
    
}
