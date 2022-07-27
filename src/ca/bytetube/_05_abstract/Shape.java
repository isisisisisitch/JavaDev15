package ca.bytetube._05_abstract;

public  abstract class Shape {

    protected double area;
    protected double grith;


    public double getArea() {
        return area;
    }

    public double getGrith() {

        return grith;
    }

    public abstract void calculate();//为了强制要求子类必须重写该方法

    public void show() {
        this.calculate();
        System.out.println("area:" + area + " grith:" + grith);
    }
}
