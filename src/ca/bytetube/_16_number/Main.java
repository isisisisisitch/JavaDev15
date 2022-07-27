package ca.bytetube._16_number;


import java.util.Random;

public class Main {

    public static void main(String[] args) {
        test7();
        //test5();
//        int offset = 65;
//        char c = (char)(offset + 1);
//        System.out.println(c);
//        char c = 65;
//
//        System.out.println(c);
//        test2();
//        Integer i = 10;
//        i.equals(11);
//
//        int[] arr = {100,20,34,50,-120,11,0};
//       // add(arr);
//        IntObj[] datas = {new IntObj(100),null,new IntObj(34),
//                new IntObj(-120),new IntObj(0)};
//
//        for (IntObj data :datas) {
//            if (data == null) {
//                System.out.println("close");
//            }else {
//                System.out.println(data.value);
//            }
//        }

    }

    public static void test7(){
        double d1 = 0.7;
        double d2 = 0.7;
        System.out.println(d1 * d2);//0.48999999999999994


    }


    public static void test6(){
        //10,000,000
//        System.out.printf("%d%n",100);
        double pi = Math.PI;//3.14159265358979323846;
        System.out.format("%8f",pi);
        System.out.println();
        System.out.format("%+8f",pi);

        long n = 100000000;





    }

    public static void test1(){
        Integer i1 = 10;
//        Integer i1 = Integer.valueOf(10);
        //Integer i1 = new Integer(10);
        //int i2 = i1;
        int i2 = i1.intValue();
    }

    /**
     * ==
     * Primitive type: value
     * reference type:address
     *
     * wrapper class:
     * equals:value
     */
    public static void test2(){

        Integer i1 = 88;
        Integer i2 = 88;
        Integer i3 = 888;
        Integer i4 = 888;
        System.out.println(i1 == i2);//true
        System.out.println(i3 == i4);//false

        System.out.println(i1.equals( i2));//true
        System.out.println(i3.equals( i4));//true

    }

    public static void test3(){
        Integer i1 = 188;//[-128,127]
        Integer i2 = Integer.valueOf(88);

        Integer i3 = new Integer(88);
        System.out.println(i1 == i2);//true
        System.out.println(i1 == i3);//false


    }

    public static void test4(){
        //生成[0,99]整数
        Random random = new Random();
        int num1 = random.nextInt(100);
        int num2 = (int) (Math.random() * 100);
        //生成[10,99]整数
        int offset = 10;
        int num3 = random.nextInt(90) + offset;
        int num4 = (int) (Math.random() * 90)+ offset;


    }

    //输出4个大写的随机字母验证码
    public static void test5(){
        Random random = new Random();
        char offset = 'A';

        for (int i = 0; i < 4; i++) {
            char c = (char)(offset + random.nextInt(26));
            System.out.print(c+" ");
        }
        System.out.println();



    }




}
