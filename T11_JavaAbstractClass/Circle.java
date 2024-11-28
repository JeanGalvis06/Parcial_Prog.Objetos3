package T11_JavaAbstractClass;

public class Circle extends Figure{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.1416 * (radius*radius);
    }
    
}
