package T6_JavaThis;

public class Student {
    
    private String name;
    private int age;


    
    public Student() {
        this("jose", 10);
    }



    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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


    
    // public static void showStudent() {
    //     System.out.println("name: " + this.name + ", "  );
    // }

    
}
