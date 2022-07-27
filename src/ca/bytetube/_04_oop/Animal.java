package ca.bytetube._04_oop;

public class Animal {
    public Parent speak(int i){
        System.out.println("animal speak");
        return new Parent();
    }

    public void run(){
        System.out.println("animal run");
    }
}
