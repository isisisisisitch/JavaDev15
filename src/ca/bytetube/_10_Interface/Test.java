package ca.bytetube._10_Interface;

public class Test {

    public static void main(String[] args) {
        Child child = new Child("david");
//        Student student = new Student("tony");
//        child.setTutor(student);
//        child.learn();

        Teacher teacher = new Teacher("dal");
        child.setTutor(teacher);
        child.learn();

    }
}
