package ca.bytetube._10_Interface;

public class Dragon implements Fire,Fly{


    public static void main(String[] args) {
        Dragon dragon = new Dragon();
        System.out.println(dragon.myself());
    }
}
