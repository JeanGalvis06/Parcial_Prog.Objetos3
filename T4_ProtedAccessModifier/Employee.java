package T4_ProtedAccessModifier;

public class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    protected void showInfo() {
        System.out.println("Name: " + name + "," + " Salary: " + salary);
    }
}
