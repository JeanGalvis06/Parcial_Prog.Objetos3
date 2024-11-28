package T17_LiskovSubstitutionPrinciple;

public class Bike extends Transportation{
    
    @Override
    public void transport() {
        System.out.println("the transportation is by bike...");
    }
}
