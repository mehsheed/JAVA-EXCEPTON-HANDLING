class egexp
{
    public static void main (String args[])
    {
        try {
        int a[] = new int[7];
        a[4] = 30/0;
        System.out.println("First print statement in try block");}
        catch(ArithmeticException e)
        {
            System.out.println("ARTHEMETIC EXCEPTION");

        }
    
          

    
}
}