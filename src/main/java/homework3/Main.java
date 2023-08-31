package homework3;

public class Main {
    public static void main(String[] args) {
        Product chair = new PhysicalProduct("chair", 99.5,4, "acasa");
        Product table = new PhysicalProduct("table", 150.5,1, " la terasa");

        ShoppingCart cart = new ImplementationCart();

        cart.addProduct(chair);
        cart.removeProduct(table);
        cart.addProduct(table);

        System.out.println(cart.calculateCost());

    }
}
