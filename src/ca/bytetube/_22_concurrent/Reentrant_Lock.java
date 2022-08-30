package ca.bytetube._22_concurrent;

public class Reentrant_Lock {
    public static void main(String[] args) {

        synchronized ("bytetube"){
            synchronized ("bytetube"){
                System.out.println("dal");
            }

        }

    }


}
