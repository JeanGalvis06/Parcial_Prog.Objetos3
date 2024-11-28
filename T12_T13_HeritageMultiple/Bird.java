package T12_T13_HeritageMultiple;

public class Bird implements Flyer, Singer {

    @Override
    public void sing() {
       System.out.println("the bird is sing");
    }

    @Override
    public void fly() {
        System.out.println("the bird is flaying");
    }
    
}
