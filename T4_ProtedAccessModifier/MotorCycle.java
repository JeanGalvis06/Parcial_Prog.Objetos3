package T4_ProtedAccessModifier;

public class MotorCycle extends Vehicle{
    private int cylinderCapacity;

    public MotorCycle(String brand, String type, int cylinderCapacity) {
        super(brand, type);
        this.cylinderCapacity = cylinderCapacity;
    }

    public int getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(int cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

}
