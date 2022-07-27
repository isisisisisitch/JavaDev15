package ca.bytetube._10_Interface;

public class Student implements Tutorable{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void coding(Child child){
        System.out.println("Student " + this.name + " teaches " + child.getName() + " coding");
    }

    @Override
    public void swimming(Child child){
        System.out.println("Student " + this.name + " teaches " + child.getName() + " swimming");
    }

}
