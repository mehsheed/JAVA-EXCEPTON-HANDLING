import java.util.Scanner;
class PushException extends Exception
{
    PushException(String msg)
    {
        super(msg);
        
    }
}
class PopException extends Exception
{
    PopException(String msg)
    {
        super(msg);
    }

}
class Stack
{

    int a[];
    int top;
    Stack()
    {
        a= new int [5];
        top = -1;

    }
    Stack(int size)
    {
        a = new int [size];
        top =-1;
    }
    void push (int ele) throws PushException
    {
        if(top == a.length-1)
        {
            PushException e = new PushException("Overflow");
            throw e;
        }
        top ++;
        a[top]=ele;
    }
    void pop() throws PopException
    {
        if(top == -1)
        {
            PopException e = new  PopException("Underflow");
            throw e;
        }
        System.out.println("popped element"+a[top]);
        top--;
    }
}


public class stackusdex 
{
  public static void main(String args[])
  {
      Scanner sc = new Scanner(System.in);
      
      Stack st = new Stack(2);
      try
      {
          while(true)
          {
              System.out.println("1- push 2-pop");
              System.out.println("Enter choice");
              int  c = sc.nextInt();
              if(c == 1)
              {
                  st.push(sc.nextInt());
              }
              else if (c ==2)
              {
                  st.pop();
              }
              System.out.println("Do you want to continue 1/0?");
              c = sc.nextInt();

              if(c == 0)
              {
                  System.exit(0);
              }


          }
      }
      catch (PushException e)

      {
          System.out.println(e);

      }
      catch (PopException e)
      {
          System.out.println(e);
      }
      


  }
  

  


    
}
