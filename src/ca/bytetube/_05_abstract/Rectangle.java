package ca.bytetube._05_abstract;

public class Rectangle extends Shape {
    private double width;
    private double height;


    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void calculate() {
        area = width * height;
        grith = 2 * (width + height);

    }


}
