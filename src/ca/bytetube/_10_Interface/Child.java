package ca.bytetube._10_Interface;

public class Child {
    private String name;
    private int age;
    private Tutorable tutor;

    public Child(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setTutor(Tutorable tutor) {
        this.tutor = tutor;
    }

    public void learn(){
        tutor.coding(this);
        tutor.swimming(this);
    }
}
