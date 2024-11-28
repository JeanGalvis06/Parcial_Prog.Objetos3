package T8_T9_SimpleHeritage;

public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void showPerson() {
        System.out.println("Name: " + name + ", " + "age: " + age );
    }
}
