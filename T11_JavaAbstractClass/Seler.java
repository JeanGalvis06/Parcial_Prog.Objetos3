package T11_JavaAbstractClass;

public class Seler extends Employee{
    private double bonus;
    private final double salary = 15000;

    public Seler(double bonus) {
        this.bonus = bonus;
    }



    @Override
    public double calculateSalary() {
        if (bonus == 0) {
            System.out.println("the seler does not contain bonus");
        }

        return bonus * salary;
    }
    
}
