import java.io.*;
class Employee
{
    String name;
    int age;
    double salary;
    char grade;
    void input() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);
        String input;
        name = br.readLine();
        input = br.readLine();
        age = Integer.parseInt(input);
        input = br.readLine();
        salary=Double.parseDouble(input);
       
        grade=(char) br.read();

}
    void display()
    {
        System.out.println("Name :  "+name+"  Age:  "+age+"  SALARY  "+salary+"Grade"+grade);

    }

}

public class empexp 
{
    public static void main (String args[])
    {
        Employee emp = new Employee();
        try
        {
             emp.input();
             emp.display();


        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }

    
}
