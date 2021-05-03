


public class smlexp {
    
    public static void main (String args[])
    {
        int a = 50;
        try
        {
        int b= a/Integer.parseInt(args[0]);
        System.out.println("b="+b);
        }
        catch(ArithmeticException e)
        {
            System.out.println("ARTHEMETICS EZCEPTION"+ e);

        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("No argument"+e);
        }
        catch(Exception e)
        {
            System.out.println("EXCEPTION GENERATED");
        }
    }

    
}
