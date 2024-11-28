package T4_ProtedAccessModifier;

public class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }


    public void showinformation() {
        showInfo();
        System.out.println("department: " + department);
    }
    
}
