package T11_JavaAbstractClass;

public abstract class Figure {

    public abstract double calculateArea();

    public void showArea() {
        System.out.println(calculateArea());
    }

    // public void drawFigure() {
    //     System.out.println("Drawing a figure..");
    // }
}