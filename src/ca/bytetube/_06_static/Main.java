package ca.bytetube._06_static;

public class Main {
    public static void main(String[] args) {
        Rocket r1 = Rocket.getInstance();
        Rocket r2 = Rocket.getInstance();
        System.out.println(r1 == r2);

//        Rocket r3 = new Rocket();
    }
}
