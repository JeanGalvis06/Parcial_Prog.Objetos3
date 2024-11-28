package T2_PrivateModifierAccess;

public class Main {
    

    public static void main(String[] args) {
        
        Student student1 = new Student("Jose", 20, 4.3);
        Car car = new Car("Audi", "232nnmd", 250);

        System.out.println("max speed: " + car.getMaxSpeed());

        car.accelerate(100);

        System.out.println("max speed: " + car.getMaxSpeed());


        System.err.println("name: " + student1.getName());
        
    }

}
