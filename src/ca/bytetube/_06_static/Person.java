package ca.bytetube._06_static;

public class Person {

    private String name;
    private int age ;
    public static int count ;//class variable
    //initialization block
    {

        System.out.println("initialization block run");
        age  = 1;
    }

    static {
        count = 100;
        System.out.println("static initialization block run ");
    }

    public Person() { }

    public Person(String name){

      this.name = name;


    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Person person1 = new Person("bytetube");
        System.out.println(person1);

    }


}
