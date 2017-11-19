public class Student extends Tickets {
private float price = 6;
   private String name = "student";

    public void display(double discount)
    {
        System.out.println(name + " £" + d.format(price-discount));
    }

    public float getPrice(float discount) {
        return price-discount;
    }
}
