package homework3;

public class PhysicalProduct extends Product{
    public PhysicalProduct(String name, double price, int quantity, String shippingAdress){
        super(name,price,quantity);
        this.shippingAdress = shippingAdress;


    }

    String shippingAdress;

}
