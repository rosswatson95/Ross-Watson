public class Standard extends Tickets
{
    private float price = 8;
    private String name = "standard";

    public void display(double discount)
    {
        System.out.println(name + " £" + d.format(price-discount));
    }

    public float getPrice(float discount) {
        return price-discount;
    }

}
