package T17_LiskovSubstitutionPrinciple;

public class Car extends Transportation {

    @Override
    public void transport() {
        System.out.println("the transportation is by car...");
    }
    

}
