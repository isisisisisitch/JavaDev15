package ca.bytetube._19_generic;



import java.util.*;


public class Main {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        List<Double> list2 = new LinkedList<>();
        sum(list2);
        //10
        Box<? extends Number> box = null;
        int i = 10;
//        Student[] students = new Student[3];
//        students[0] = new Student(100);
//        students[1] = new Student(91);
//        students[2] = new Student(45);
//
//        Arrays.sort(students);
//        for (Student student : students) {
//            System.out.println(student);
//        }
//
//
//        Student[] students2 = new Student[3];
//        students2[0] = new Student(100);
//        students2[1] = new Student(91);
//        students2[2] = new Student(45);
//        Arrays.sort(students2, (o1, o2)-> o2.getScore().compareTo(o1.getScore()));
//        for (Student student : students2) {
//            System.out.println(student);
//        }


//        Integer[] array = {40,23,11,56,78,92,32};
//        Integer max = getMax(array);
//        System.out.println(max);
//        Double[] array2 = {40.1,23.2,11.3,56.4,78.5,92.6,32.7};
//        Double max1 = getMax(array2);
//        System.out.println(max1);
//
//        Student[] students = new Student[3];
//        students[0] = new Student("abc");
//        students[1] = new Student(1);
//        students[2] = new Student("A");
//
//        Student maxStudent = getMax(students);
//        System.out.println(maxStudent);

//        Student<String,Double> student1 = new Student<>();
//        set(student1,"ac123",99.8);
//        Student<Integer,Double> student2 = new Student<>();
//        set(student2,123,99.8);

    }

    public static <T> void  fooHelper(List<T> list){
        T obj = list.get(0);
        list.set(0,obj);
        list.set(0,list.get(0));
    }


    public static void foo(List<?> list){//Person
        fooHelper(list);
    }

    //
    public static double sum(List<? extends Number> list){
        double res = 0;
        for (Number element : list) {
            res += element.doubleValue();
        }

        return res;

    }


    public static void test4(){
        Box<Integer> box1 = new Box<>();
        Box<Double> box2 = new Box<>();
        Box<Object> box3 = new Box<>();
        Box<String> box4 = new Box<>();
        showBox(box1);
        showBox(box2);
//        showBox(box3);
//        showBox(box4);

    }


    public static void showBox(Box<? extends Number> box){

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
