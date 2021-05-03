interface intstack
{
    public void push(int ele);
    public void pop();



}
class Dynamicstack implements intstack
{

    int a[];
    int top;
    Dynamicstack()
    {
        a= new int [3];
        top = -1;

    }
    Dynamicstack(int size)
    {
        a = new int [size];
        top =-1;
    }
    public void push (int ele)
    {
        if(top == a.length-1)
        {
           int b[] = new int[a.length*10];
           for(int i= 0; i< a.length; i++)
           {
               b[i] = a[i];
           }
           a=b; 
          top++;
          a[top] = ele;
          System.out.println("Length of stack :"+top);
        }
        top++;
          a[top] = ele;


    }
    public void pop ()
    {
        if(!Isunderflow()){
        System.out.println("Popped element :"+a[top]);
        top--;
        System.out.println("Length of stack :"+top);
        }

    }
    
    boolean Isunderflow()
    {
        if(top ==-1)
        {
            System.out.println("Underflow");
            return true;

        }
        else{
            return false;
        }
    }


}
class fixedstack implements intstack
{

    int a[];
    int top;
    fixedstack()
    {
        a= new int [3];
        top = -1;

    }
    fixedstack(int size)
    {
        a = new int [size];
        top =-1;
    }
    public void push (int ele)
    {
        if(!Isoverflow())
        {
          top++;
          a[top] = ele;

        }


    }
    public void pop ()
    {
        if(!Isunderflow()){
        System.out.println("Popped element :"+a[top]);
        top--;
        }

    }
    boolean Isoverflow()
    {
        if (top == a.length-1)
        {
            System.out.println("OverFlow");
            return true;
        }
        else
        {
            return false;
        }
    }
    boolean Isunderflow()
    {
        if(top ==-1)
        {
            System.out.println("Underflow");
            return true;

        }
        else{
            return false;
        }
    }
    


}
public class infstack 
{
  public static void main (String[] args)
  {
      fixedstack fs = new fixedstack ();
      Dynamicstack ds = new Dynamicstack ();
      intstack s;
      s= fs;
      s.push(60);
      s.push(10);
      s.push(10);
      s.push(100);
      s = ds;
      s.push(60);
      s.push(10);
      s.push(10);
      s.push(50);
      s.pop();
      
      
      



      

  }
    
}