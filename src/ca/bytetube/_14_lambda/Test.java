package ca.bytetube._14_lambda;

public class Test {
    public static void main(String[] args) {
        System.out.println();

        Math.max(10,20);
        //jdk 8
        /*
        参数列表->{

           方法体

        }
         */

        Calculator.execute(10, 20, ( ) -> 1 + 2);

        Calculator.execute(10, 20, () -> {
            return 1 + 2;
        }); // 30

        //Calculator.execute(11, 22, (v1, v2) -> v1 + v2); // 33
    }
}
