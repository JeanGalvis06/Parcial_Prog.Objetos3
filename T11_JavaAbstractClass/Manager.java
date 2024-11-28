package T11_JavaAbstractClass;

public class Manager extends Employee {
    private final double salary = 10000;

    @Override
    public double calculateSalary() {
        return salary;
    }

    
}
