class SeatNotBookedException extends Exception
{
    SeatNotBookedException(String msg)
    {
        super(msg);
    }
}

class ReserveTicket
{
    int seatsavailable;
    ReserveTicket()
    {
        seatsavailable = 0;
    }
    ReserveTicket(int r)
    {
        seatsavailable = r;
    }

    void reserve(int numberofseats) throws SeatNotBookedException
    {
        if (numberofseats > seatsavailable || numberofseats <1) 
        {
            SeatNotBookedException e= new SeatNotBookedException("Seat not booked");
            throw e;
        } 
        else
        {
            seatsavailable = seatsavailable - numberofseats;
            System.out.println("Seats booked");


        }




    }

}


public class rstmain 
{
    public static void main(String args[]) 
    {
        ReserveTicket rt = new ReserveTicket(50);
        try
        {
            rt.reserve(60);
        }
        catch(SeatNotBookedException e)
        {
            System.out.println(e);
        }


        
    }
    
}
