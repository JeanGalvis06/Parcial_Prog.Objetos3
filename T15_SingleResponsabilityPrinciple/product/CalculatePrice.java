package T15_SingleResponsabilityPrinciple.product;

import java.util.List;

public class CalculatePrice {

    public double calculatePrice(List<Product> products) {
        var result = 0.0;
        for (Product product : products) {
            result += product.getPrice();
        }

        return result;
    }
}
