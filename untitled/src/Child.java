public class Child extends Tickets {
private float price = 4;
    private String name = "child";



    public void display(double discount)
    {
        System.out.println(name + " £" + d.format(price-discount));
    }


    public float getPrice(float discount) {
        return price-discount;
    }
}
