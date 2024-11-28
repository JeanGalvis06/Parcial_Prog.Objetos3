package T8_T9_SimpleHeritage;

public class Student extends Person{
    private String registered;

    public Student(String name, int age, String registered) {
        super(name, age);
        this.registered = registered;
    }

    public String getRegistered() {
        return registered;
    }

    public void setRegistered(String registered) {
        this.registered = registered;
    }

    @Override
    public void showPerson() {
        super.showPerson();
        System.out.println("Registered: " + registered );
    }


}
