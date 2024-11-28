package T17_LiskovSubstitutionPrinciple;

public class Main {
    
    public static void main(String[] args) {
        Bike bike = new Bike();
        Car car = new Car();

        car.transport();
        bike.transport();

    }
}
