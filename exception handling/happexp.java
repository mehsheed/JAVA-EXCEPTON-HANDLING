import java.util.Scanner;
class NoSuchStringException extends Exception
{
    NoSuchStringException(String msg) 
    {
        super(msg);
        
        
        

        
        
    }
    

}


public class happexp 
{
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       try 
       {
       if(s.equals("Happy"))
       {
           System.out.println("Same");

       }
       else 
       {
        NoSuchStringException e = new NoSuchStringException("Not equal");
           throw e;
          

           
       } 
    }
    catch (NoSuchStringException e )
    {
        System.out.println(e);
    }
       
   }




    
}
