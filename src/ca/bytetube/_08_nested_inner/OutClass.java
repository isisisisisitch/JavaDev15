package ca.bytetube._08_nested_inner;

public class OutClass {


    private int a = 1;
    private static int b = 2;

    public void test1(){
        int c = 3;
        class LocalClass{

            private static final int d = 2;

            public void test2(){
                System.out.println(a + b + c+ d);
                test3();
            }

        }

        new LocalClass().test2();

    }

    public void test3(){
        System.out.println("OutClass test3");
    }

    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        outClass.test1();

    }



}
