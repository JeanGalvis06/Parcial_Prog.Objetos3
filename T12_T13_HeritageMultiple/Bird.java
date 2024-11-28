package T12_T13_HeritageMultiple;

public class Bird implements Flayer, Singer {

    @Override
    public void sing() {
       System.out.println("the bird is sing");
    }

    @Override
    public void flay() {
        System.out.println("the bird is flaying");
    }
    
}
