package T8_T9_SimpleHeritage;

public class Main {
    
    public static void main(String[] args) {
        var car = new Car("toyota", 500, 4);
        var student = new Student("Jose", 18, "sdasde2");

        student.showPerson();
        car.showVehicle();
    }
}
