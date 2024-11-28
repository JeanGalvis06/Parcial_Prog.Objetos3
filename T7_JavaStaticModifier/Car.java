package T7_JavaStaticModifier;

public class Car {
    private String brand;
    private String model;
    public static int countCar = 0;

    public Car() {
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        countCar++; 
    }



    public static void showCounCart() {
        System.out.println("cars: " + countCar);
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

    public static int getCountCar() {
        return countCar;
    }

    public static void setCountCar(int countCar) {
        Car.countCar = countCar;
    }
    
    
}
