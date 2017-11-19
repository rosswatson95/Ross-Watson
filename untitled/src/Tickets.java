import java.text.DecimalFormat;

abstract public class Tickets {
String name ;
float price;
static DecimalFormat d = new DecimalFormat("0.00");

    abstract public void display(double discount);

    abstract  public float getPrice(float discount);

}

