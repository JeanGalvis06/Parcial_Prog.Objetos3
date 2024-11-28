package T8_T9_SimpleHeritage;

public class Vehicle {
    protected String brand;
    protected int maxSpeed;
    
    public Vehicle() {
    }

    public Vehicle(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    
    public void showVehicle() {
        System.out.println("brand: " + brand + "," + "max Speed: " + maxSpeed);
    }
}
