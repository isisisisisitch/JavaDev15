package ca.bytetube._19_generic;

public class Student<T> {
    private T score;
//    private N no;
//    private S address;

    public Student(T score) {
        this.score = score;
    }

    public T getScore() {
        return score;
    }

    public void setScore(T score) {
        this.score = score;
    }

}
