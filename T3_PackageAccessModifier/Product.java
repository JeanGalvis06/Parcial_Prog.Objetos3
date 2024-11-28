package T3_PackageAccessModifier;

public class Product {
    String name;
    double price;
    int stock;

    public Product() {
    }

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

   
    void showInfo() {
        System.out.println("Name: " + name + " Price: " + " Stock: " + stock);
    }

    
}
