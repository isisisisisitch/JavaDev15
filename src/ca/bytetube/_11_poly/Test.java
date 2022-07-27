package ca.bytetube._11_poly;

public class Test {
    public static void main(String[] args) {
        //test1();
        //test2();
        speak(new Cat());
    }


    public static void test3(){

    }

    public static void speak(Animal animal){

        if (animal instanceof Dog) {
            ((Dog) animal).wang();
        }
        else if (animal instanceof Cat) {
            ((Cat) animal).miao();
        }else {

        }

    }


//    public static void test2(){
//        Animal animal = new Dog(2,4);
//        System.out.println(animal.leg);
//        animal.speak();
//    }












    public static void test1(){
//        int i = 10;
//        double d = i;
//        Animal animal = new Dog();
//        animal.speak();
    }
}
