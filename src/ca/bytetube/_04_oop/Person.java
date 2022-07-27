package ca.bytetube._04_oop;

/**
 * javaBean
 *
 * 1.member variables
 * 2.member methods
 *
 *3.constructors(non-argument)
 *
 * 4.setters and getters
 * 5.toString()
 *
 */

public class Person extends Object{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
