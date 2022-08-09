package ca.bytetube._20_collections;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        //test3();
        //test4();
        //test5();
//        test6();
//        test7();
//        test8();
        test10();
    }

    public static void test11() {
        Queue<Integer> queue = new LinkedList<>();//

    }

    public static void test10() {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.push(13);
        Integer num = stack.peek();
        System.out.println(num);
        System.out.println(stack.size());


    }


    public static void test9() {
        //LinkedList
    }

    public static void test8() {

//        List<Integer>List = new ArrayList<>();
//        List.add(1);
//        List.add(12);
//        List.add(13);
//        List.add(0,12);
//        System.out.println(List);
//
//        int size = List.size();
//        for (int i = 0; i <size; size--) {
//            List.remove(i);
//
//        }
//        System.out.println(List);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(14);


        ListIterator<Integer> iterator = arrayList.listIterator();
        while (iterator.hasNext()) {
            if ((iterator.next() & 1) == 0) {
                iterator.remove();
            }

            // arrayList.remove(next);

        }
//        //10,11,12,13,14,100
        System.out.println(arrayList);

//         int modCount = 0;
//        int oldCount = modCount;
//        for (int i = 0;i < 10; i++){
//            // add/remove
//            modCount++;
//            if (oldCount != modCount) {
//                    new ConcurrentModificationException();
//            }
//        }
//
//        int size = arrayList.size();//4
        //12,14

//        for (int i = 0; i < size; i++) {
//           arrayList.remove(i);//[12, 14]
//        }
        //personA
//        for (Integer element : arrayList) { //
//            //personB
//            arrayList.add(100);//ConcurrentModificationException
//        }

//        arrayList.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer element) {
//                arrayList.remove(element);//ConcurrentModificationException
//            }
//        });


        // System.out.println(arrayList);

    }

    public static void test7() {
        ClassRoom room = new ClassRoom("bytetube", "dal", "david");
        for (String s : room) {
            System.out.println(s);
        }
    }

    public static void test6() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(13);

//        list.forEach(System.out::println);

//        list.forEach((integer -> {
//            //Integer next = integer + 10;
//            System.out.println(integer);
//                }));

//        list.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {//proxy
//                Integer next = integer + 10;
//                System.out.println(next);
//            }
//        });
//        Iterator<Integer> iterator = list.iterator();
//       while (iterator.hasNext()){
//           Integer next = iterator.next();
//           System.out.println(next);
//       }

        int index = 0;
        for (Integer element : list) {
            System.out.println(element);
            index++;
            if (index == 3) break;
        }

//        int size = list.size();
//        for (int i = 0; i < size; i++) {
//            System.out.println(list.get(i));
//        }
    }


    public static void test5() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(13);
        Integer[] array = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));

    }


    public static void test4() {

//        Object[] array3 = new Object[10];
        // Object[] array1 = {11,22,33};
        Object[] array1 = new Object[]{11, 22, 33};//Obj


        Integer[] array2 = (Integer[]) array1;
        System.out.println(array2);

    }

    public static void test3() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(13);
        Object[] array = list.toArray();
        for (Object obj : array) {
            System.out.println(obj);
        }

    }


    public static void test2() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(13);

        List<Integer> list2 = new LinkedList<>();

        list2.add(11);
        list2.add(12);


        list.retainAll(list2);
        System.out.println(list);

    }


    public static void test1() {
        List list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add("abd");
        list.add(true);
        System.out.println(list);


    }
}
