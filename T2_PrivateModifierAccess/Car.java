package T2_PrivateModifierAccess;

public class Car {
    private String brand;
    private String model;
    private int maxSpeed;

    public Car() {
    }

    public Car(String brand, String model, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    
    public void accelerate(int acc) {
        if (acc < 0) {
            System.out.println("accelerate must be positive");
        } else {
            maxSpeed += acc;
        }
    }
    
}
