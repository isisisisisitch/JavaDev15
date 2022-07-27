package ca.bytetube._10_Interface;

public interface Fly extends Animal{

//    @Override
    default String myself(){
        return "Im able to fly";

    }
}
