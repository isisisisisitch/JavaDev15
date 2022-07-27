package ca.bytetube._04_oop;

public class Child extends Parent{
    public double money = 200000000.0;

    public void func(){
        System.out.println("Child func");
    }

    public void showMoney(){
        System.out.println(super.money);
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.showMoney();
    }

}

