
package T8_T9_SimpleHeritage;

public class Car  extends Vehicle{
    private int numberDor;

    public Car(String brand, int maxSpeed, int numberDor) {
        super(brand, maxSpeed);
        this.numberDor = numberDor;
    }

    public int getNumberDor() {
        return numberDor;
    }

    public void setNumberDor(int numberDor) {
        this.numberDor = numberDor;
    }

    @Override
    public void showVehicle() {
        super.showVehicle();
        System.out.println("number of dor: " + numberDor);
    }
}
