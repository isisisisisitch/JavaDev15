package ca.bytetube._18_exceptions;

public class Asserts {

    public static void test(boolean v){
        if (v) return;
        try {
            throw new IllegalArgumentException("test failed");
        }catch (Exception e){
            System.err.println(e.getStackTrace()[1]);
            //e.printStackTrace();
        }

    }
}
