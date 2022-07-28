package ca.bytetube._18_exceptions;

import java.io.IOException;

public class Person {
    private String name;

    public Person(String name) throws Exception {
        if (name == null || name.length() == 0) {
            throw new Exception("Argument must not be empty");
        }

        this.name = name;
    }

//    public Person(String name) throws IllegalArgumentException{
//        if (name == null || name.length() == 0) {
//            throw new IllegalArgumentException("Argument must not be empty");
//        }
//
//        this.name = name;
//    }
    //    private int age;
//
//    public Person(int age) {
//        this.age = age;
//    }




    public void test1(){ }
    public void test2()throws IOException { }
    public void test3()throws IOException{ }
    public void test4()throws IOException{ }


}
