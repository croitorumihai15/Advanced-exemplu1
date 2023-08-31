package homework3;

public class DigitalProduct extends Product{
    double storageSize;

    public DigitalProduct(String name, double price, int quantity, double storageSize){
        super(name,price,quantity);
        this.storageSize = storageSize;
    }


}
