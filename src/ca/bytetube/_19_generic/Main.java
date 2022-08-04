package ca.bytetube._19_generic;



import java.util.ArrayList;
import java.util.Collection;


public class Main {

    public static void main(String[] args) {
        Integer[] array = {40,23,11,56,78,92,32};
        Integer max = getMax(array);
        System.out.println(max);
        Double[] array2 = {40.1,23.2,11.3,56.4,78.5,92.6,32.7};
        Double max1 = getMax(array2);
        System.out.println(max1);

        Student[] students = new Student[3];
        students[0] = new Student("abc");
        students[1] = new Student(1);
        students[2] = new Student("A");

        Student maxStudent = getMax(students);
        System.out.println(maxStudent);

//        Student<String,Double> student1 = new Student<>();
//        set(student1,"ac123",99.8);
//        Student<Integer,Double> student2 = new Student<>();
//        set(student2,123,99.8);

    }


    public static <T extends Comparable<T>> T getMax(T[] array){
        if (array == null || array.length == 0) return null;
        T max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) max = array[i];
        }

        return max;

    }


//    public static <T1,T2> void set( Student<T1,T2> student ,T1 no,T2 score){
//        student.setNo(no);
//        student.setScore(score);
//    }




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
