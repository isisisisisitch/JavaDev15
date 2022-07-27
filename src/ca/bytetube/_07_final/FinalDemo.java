package ca.bytetube._07_final;

public class FinalDemo {
    private int age;
    public static final String NAME ;
    static {
        NAME = "bytetube";
    }


    public FinalDemo(int age) {
        this.age = age;

    }

    public static void main(String[] args) {
        FinalDemo f1 = new FinalDemo(10);
        System.out.println(FinalDemo.NAME);


    }

}
