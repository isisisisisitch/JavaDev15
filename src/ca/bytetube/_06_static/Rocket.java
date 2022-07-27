package ca.bytetube._06_static;

//early
//public class Rocket {
//    private static Rocket instance = new Rocket();
//    private Rocket() {
//    }
//
//    public static Rocket getInstance(){
//        return instance;
//    }

//lazy
public class Rocket {
    private static Rocket instance = null;
    private Rocket(){}

    public static Rocket getInstance(){
        if (instance == null) {
            instance = new Rocket();
        }

        return instance;

}

}
