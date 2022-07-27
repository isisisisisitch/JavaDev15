package ca.bytetube._18_exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Main {


    public static void main(String[] args) {
        //test1();
        //test2();
        //test3();
//        test4();
//        test5();
        test6();
    }


    public static void test6(){
        PrintWriter out = null;
        try {
            //FileNotFoundException
            out = new PrintWriter("/Users/dalluo/Desktop/finally1.txt");
            out.print("how are you!");

        } catch (FileNotFoundException e) {
          e.printStackTrace();
        }finally {
            if (out != null) {
                System.out.println("finally");
                out.close();
            }
        }


    }


    public static void  test5(){
        Integer[] nums = {11,null,22};
        for (Integer num : nums) {
            System.out.println(num);
        }
    }


    public static void test4() {
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        //java.text.ParseException
        try {
            fmt.parse("2022/07/26");
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println("1");

    }


    public static void test3() {

        try {
            //java.io.FileNotFoundException
            FileOutputStream fos = new FileOutputStream("/Users/dalluo/Desktop/finally.txt");
            System.out.println("1");
            // NullPointerException
            StringBuilder sb = null;
            sb.append("123");
            System.out.println("2");

            int[] array = {11, 22, 33};
            //ArrayIndexOutOfBoundsException
            array[4] = 44;
            System.out.println("3");

        } catch (FileNotFoundException e) {
            System.out.println("there is FileNotFoundException!");

        } catch (NullPointerException e) {
            System.out.println("there is NullPointerException!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("there is ArrayIndexOutOfBoundsException!");
        }

        System.out.println("4");
    }

    public static void test() {
        //StackOverflowError
        test();
    }

    public static void test2() {
//        //error,RuntimeException
//        for (int i = 0; i < 200; i++) {
//            //OutOfMemoryError
//            long[] a = new long[100];
//        }
//        test();

        //NullPointerException
//        StringBuilder sb = null;
//        sb.append("123");

        //NumberFormatException
        //Integer i = new Integer("abc");

//        int[] array = {11,22,33};
//        //ArrayIndexOutOfBoundsException
//        array[4] = 44;

        //ClassCastException
        Object obj = 123.4;
        Double d = (Double) obj;


    }


    public static void test1() {
        //java.io.FileNotFoundException
        //FileOutputStream fos = new FileOutputStream("/Users/dalluo/Desktop/finally.txt");

//        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
//        //java.text.ParseException
//        fmt.parse("2022/07/26");
        //java.lang.InterruptedException
//        Thread.sleep(1000);

//        Person person = new Person();
        // java.lang.ClassNotFoundException
        Class aClass = null;
        try {
            aClass = Class.forName("ca.bytetube._18_exceptions.Person");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        //java.lang.InstantiationException, java.lang.IllegalAccessException
        try {
            Person person = (Person) aClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            System.out.println("IllegalAccessException happened");
        }


    }
}
