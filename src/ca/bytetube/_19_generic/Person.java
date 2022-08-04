package ca.bytetube._19_generic;

public class Person<T extends A & B & C > {
    private T age;

    public Person() {
    }

    public Person(T age) {
        this.age = age;
    }

    //    public <E> Person(E name, T age) {
//        this.age = age;
//
//    }

    public static void main(String[] args) {
//        Person person1 = new Person("dal",10.5);//Integer/Double
//        Person person2 = new Person(66,10.5);//Integer/Double

        //Person p1 = new Person(11.2);


    }
}
