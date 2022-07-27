package ca.bytetube._05_abstract;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculate() {

        area = Math.PI * radius * radius;
        grith = 2 * Math.PI * radius;

    }


}
