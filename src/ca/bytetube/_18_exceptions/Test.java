package ca.bytetube._18_exceptions;

// 异常的好处

public class Test {

    //1.将错误处理代码和普通代码区分
    //2.能将错误信息传递到方法stack中
    //3.能对错误类型进行区分和分组

    public static void main(String[] args) {
//        System.out.println(add(10,5) == add(3,12));
//        System.out.println(add(10,5) == add(2,12));
//        System.out.println(add(10,4) == add(3,12));
//        System.out.println(add(10,5) == add(3,12));
        Asserts.test(add(10,5) == add(3,12));
        Asserts.test(add(10,5) == add(1,12));
//        if( divide(10,2) == 0){
//            //错误处理代码
//        }else {
//            //正常的逻辑代码
//        }
//
//        try {
//            int res = divide(10, 0);
//            //正常的逻辑代码
//
//        }catch (IllegalArgumentException e){
//            //错误处理代码
//        }

    }


    public static int add(int a, int b){
        return a + b;
    }




    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("b can not be zero");
        }else {
            return a / b;
        }

    }


}
