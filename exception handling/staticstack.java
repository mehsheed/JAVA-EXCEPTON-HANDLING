class stack
{

    int a[];
    int top;
    stack()
    {
        a= new int [5];
        top = -1;

    }
    stack(int size)
    {
        a = new int [size];
        top =-1;
    }
    void push (int ele)
    {
        if(!Isoverflow())
        {
          top++;
          a[top] = ele;
        }


    }
    void pop ()
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



public class staticstack 
{
  public static void main (String[] args)
  {
      stack st = new stack(10);
      st.push(10);
      st.pop();
      st.pop();

  }
    
}
