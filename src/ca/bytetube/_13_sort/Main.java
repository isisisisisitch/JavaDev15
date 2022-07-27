package ca.bytetube._13_sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        int a = 10;//stack
//        Integer b = 10;//heap
//
//
//
//        Integer[] randArray = getRandArray(10, 1000);
//        printArray(randArray);
//        Arrays.sort(randArray, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
//        printArray(randArray);

        test2();

    }


    public static void test2() {
        Person p1 = new Person("A", 25, 50.2);
        Person p5 = new Person("E", 55, 50.5);
        Person p2 = new Person("B", 35, 60);
        Person p4 = new Person("D", 21, 90);
        Person p3 = new Person("C", 27, 80);


        Person[] people = { p5, p2, p4, p3,p1};
        System.out.println(Arrays.toString(people));
        Arrays.sort(people, (Person o1,Person o2)-> {
                return Double.compare(o1.weight, o2.weight);
        });
        System.out.println(Arrays.toString(people));
    }

    public static void test1() {
        Person p1 = new Person("A", 25);
        Person p2 = new Person("B", 35);
        Person p3 = new Person("C", 27);
        Person p4 = new Person("D", 21);
        Person p5 = new Person("E", 55);
        Person[] people = {p1, p2, p3, p4, p5};
        System.out.println(Arrays.toString(people));
        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
    }


    public static Integer[] getRandArray(int size, int bound) {
        Integer[] arr = new Integer[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int randNum = random.nextInt(bound) - random.nextInt(bound);//[1,bound)
            arr[i] = randNum;
        }

        return arr;


    }


    public static void printArray(Integer[] arr) {
        for (Integer element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();

    }
}
