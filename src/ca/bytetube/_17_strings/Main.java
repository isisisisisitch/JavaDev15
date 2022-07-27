package ca.bytetube._17_strings;

public class Main {

    public static void main(String[] args) {
        test7();

    }

    public static void test7(){

        String s = "";
        long begin1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            s+=i;
        }

        long end1 = System.currentTimeMillis();
        System.out.println(end1 - begin1);


        StringBuilder sb = new StringBuilder();

        long begin2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sb.append(i);
        }

        long end2 = System.currentTimeMillis();
        System.out.println(end2 - begin2);
    }


    public static void  test6(){
        String s = "abcabc";
        int index = s.lastIndexOf("bc");
        System.out.println(index);
    }

    public static void  test5(){

        char[] cs = {'a','b','c'};
        String s5 = new String(cs);
        String s6 = new String(cs);
        System.out.println(s5 == s6);

    }


    public static void test4(){
        String s1 = "555";//string literal
        String s2 = new String("555");//string literal
        String s3 = new String(s1);
        String s4 = new String(s2);

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);

    }

    public static void test3(){
        String s1 = "555";//string literal
        String s2 = "555";//string literal
        System.out.println(s1 == s2);

    }


    public static void test2(){
        String s = "555";//string literal
        s += "555";
        s = "666";
        testString(s);
        System.out.println(s);

    }


    public static void test1(){
        String s = "bytetube";
    }




    public static void testString(String str){
        str += "555";
    }


}
