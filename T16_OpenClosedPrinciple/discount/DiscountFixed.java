package T16_OpenClosedPrinciple.discount;

public class DiscountFixed extends Discount {

    @Override
    public double processDiscount(double dicount) {
        return dicount * 0.05;   
    }
    
}
