package ca.bytetube._04_oop;


public class Dog {
    public int age;
    public double weight;
    public int legs = 4;
    //Spring ioc proxy
    public Dog(){
        System.out.println("Dog no-argument constructor ");
    }
    //所有代码中，有一个原则：就近原则
    public Dog(int age){//10

        this(age,10.0);
    }

    public Dog(int age, double weight){
        this.age = age;
        this.weight = weight;
    }

    public void run(){
        System.out.println(age +  " run ");
    }

    public void eat(String food){
        this.run();//dog1
        System.out.println( weight + " eat " + food);
    }



}
