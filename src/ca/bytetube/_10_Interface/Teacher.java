package ca.bytetube._10_Interface;

public class Teacher implements Tutorable{
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void coding(Child child){
        System.out.println("Teacher " + this.name + " teaches " + child.getName() + " coding");
    }

    @Override
    public void swimming(Child child){
        System.out.println("Teacher " + this.name + " teaches " + child.getName() + " swimming");
    }
}
