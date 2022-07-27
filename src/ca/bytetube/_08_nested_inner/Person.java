package ca.bytetube._08_nested_inner;

public class Person {
    public static int age = 10;


    public static class Hand{
        private int weight = 8;


        private  void func(){
            System.out.println(age);
        }



    }

    public void outFunc(){
        new Hand().func();
        System.out.println(new Hand().weight);
    }

    public static void main(String[] args) {
        Person person = new Person();
       // Hand hand = person.new Hand();
       // System.out.println(hand.age);

    }
}
