import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {


        DecimalFormat f = new DecimalFormat("0.00");
        TicketList tickets = new TicketList();
        boolean wednesday = false;


        System.out.println("is it Wednesday? y/n ");
        Scanner deal = new Scanner(System.in);
        if(deal.nextLine().equals("y"))
        {
            tickets.discount = 2.00f;
        }

        Tickets sta = new Standard();
        Tickets stu = new Student();
        Tickets oap = new OAP();
        Tickets chi = new Child();

        System.out.println("make selection");
        System.out.println("1 : standard");
        System.out.println("2 : student");
        System.out.println("3 : OAP");
        System.out.println("4 : Child");
        System.out.println("5 : End");

        Scanner choice = new Scanner(System.in);

        boolean finished = false;

        do {
            switch (choice.nextInt()) {
                case 1:
                    tickets.add(sta);
                    break;
                case 2:
                    tickets.add(stu);
                    break;
                case 3:
                    tickets.add(oap);
                    break;
                case 4:
                    tickets.add(chi);
                    break;
                case 5:
                    finished = true;
                    break;
            }
        } while (!finished);

            tickets.display();
            System.out.println("total price: £" + f.format(tickets.total()));


    }
}
