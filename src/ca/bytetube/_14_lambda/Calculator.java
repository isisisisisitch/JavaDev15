package ca.bytetube._14_lambda;

@FunctionalInterface
public interface Calculator {

    int calculate();

    static void execute(int v1, int v2, Calculator c) {
        System.out.println(c.calculate());
    }


}
