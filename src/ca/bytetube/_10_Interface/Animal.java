package ca.bytetube._10_Interface;

public interface Animal {

    default String myself(){
        return "Im an Animal";
    }

}
