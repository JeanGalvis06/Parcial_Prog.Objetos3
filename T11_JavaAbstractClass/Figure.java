package T11_JavaAbstractClass;

public abstract class Figure {

    //Metodo Astracto
    public abstract double calculateArea();

    //Metodo Contreto
    public void showArea() {
        System.out.println(calculateArea());
    }

    // public void drawFigure() {
    //     System.out.println("Drawing a figure..");
    // }
}