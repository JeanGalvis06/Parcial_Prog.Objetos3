package T5_PublicAccessModifier;

public class Employee {
    public String name;
    public int salaary;

    public Employee() {
    }

    public Employee(String name, int salaary) {
        this.name = name;
        this.salaary = salaary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalaary() {
        return salaary;
    }

    public void setSalaary(int salaary) {
        if (salaary == 0) {
            System.out.println("the value cannot be modified");
        } else {
            this.salaary = salaary;
        }
    }

}
