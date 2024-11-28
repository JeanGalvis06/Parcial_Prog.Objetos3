package T10_JavaOverride;

public class Student  extends Person {
    
    @Override
    public void presentation() {
        System.out.println("hello, i am a student");
    }
}
