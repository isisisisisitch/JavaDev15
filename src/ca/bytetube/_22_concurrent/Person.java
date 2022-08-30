package ca.bytetube._22_concurrent;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public synchronized void hello(Person p){
        System.out.format("[%s] hello to [%s]%n",name,p.name);
        p.smile(this);

    }

    public synchronized void smile(Person p){
        System.out.format("[%s] smile to [%s]%n",name,p.name);
    }

    public static void main(String[] args) {
        Person jack = new Person("JACK");
        Person rose = new Person("ROSE");
        new Thread(() -> {jack.hello(rose);}).start();
        new Thread(() -> {rose.hello(jack);}).start();
    }
}
