package homework3;

import java.util.ArrayList;
import java.util.List;

public class ImplementationCart implements ShoppingCart {

    List <Product> products = new ArrayList<>();

    @Override
    public void addProduct(Product product) {
        if(products.contains(product)){
            System.out.println("produsul e deja in cos");
        } else { products.add(product);
            System.out.println(calculateCost());
        }

    }

    @Override
    public void removeProduct(Product product) {
        if(!products.contains(product)){
            System.out.println("produsul nu este in cos");
        } else { products.remove(product);
        }

    }

    @Override
    public double calculateCost() {
        double sum  = 0;
        for(int i=0; i<products.size(); i++){
            sum += products.get(i).price * products.get(i).quantity;
        }
        return sum;
    }
}
