package ca.bytetube._19_generic;

import java.util.ArrayList;
import java.util.Collection;


public class Main {

    public static void main(String[] args) {
        int[] arr = {11,22,33,44};
        arr[0] = 10;
       // arr.add(100);
        Integer i = 10;
        Number n = i;

    }

    @SuppressWarnings("unchecked")
    public static void test3(){
        Box box = new Box();
        Box<String> stringBox = new Box<>();
        Box<Object> objectBox = new Box<>();
        box = stringBox;

        objectBox = box;

        System.out.println(objectBox);
    }
    public static void  test2(){
        Iterable<String> it = null;
        Collection<String> col = null;
        ArrayList<String> list = null;
        it = col;
        col = list;

    }



    public static void  test1(){
        Box<String> stringBox = new Box<>();
        Box<Integer> IntegerBox = new Box<>();
        Box<Object> ObjectBox = new Box<>();
//        stringBox = IntegerBox;
//        stringBox = ObjectBox;
        ObjectBox.setElement(new Object());
        String element = stringBox.getElement();


    }




}
