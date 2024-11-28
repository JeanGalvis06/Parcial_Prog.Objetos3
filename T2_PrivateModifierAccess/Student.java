package T2_PrivateModifierAccess;

public class Student {
    private String name;
    private int age;
    private double averageGrade;

    public Student() {
      
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public Student(String name, int age, double averageGrade) {
        this(name, age);
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        String student;
        student = "Student : " + " name: " + this.name + ", " +
                " age: " + this.age + ", " + " Average Grade " + this.averageGrade;

        return student;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(int averageGrade) {
        this.averageGrade = averageGrade;
    }

    
}
