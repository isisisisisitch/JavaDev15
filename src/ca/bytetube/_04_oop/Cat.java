package ca.bytetube._04_oop;

public class Cat extends Animal{
    @Override
    public void run() {
        System.out.println("cat run");
    }

    @Override
    public Child speak(int i) {
        super.speak(i);
        run();
        this.run();
        super.run();
        System.out.println("cat speak");
        return new Child();
    }

    public static void main(String[] args) {
       Cat cat = new Cat();
        cat.speak(1);

        new Cat().speak(1);

    }
}
