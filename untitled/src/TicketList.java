import sun.security.krb5.internal.Ticket;
import java.text.DecimalFormat;

public class TicketList {
int i = 0;
float discount = 0.0f;
DecimalFormat f = new DecimalFormat("0.00");


    Tickets[] CustomerList = new Tickets[5];



   public void add(Tickets t)
    {
    if(i<CustomerList.length)
    {
        CustomerList[i] = t;
        System.out.println("Ticket No."+ i + " Added");
        i++;
    }

    }

    public void display()
    {
        for(int count = 0; count <i; count++)
        CustomerList[count].display(discount);
    }

    public float total()
    {
        float total = 0;
        for(int count = 0; count <i; count++)
        {
            total = total + CustomerList[count].getPrice(discount);
        }
     return total;
    }

    public void increaseSize()
    {

    }



}
