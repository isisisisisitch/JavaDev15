package ca.bytetube._13_sort;

public class Person implements Comparable<Person>{
    public String name;
    public int age;

    public double weight;

    public Car car;



    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Person p) {
        return  p.age - this.age;
    }
}
