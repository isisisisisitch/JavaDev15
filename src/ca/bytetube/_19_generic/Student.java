package ca.bytetube._19_generic;

public class Student<T extends Comparable<T>> implements Comparable<Student<T>>{
//    private N no;
    private T score;

    public Student(T score) {
        this.score = score;
    }

    //    public Student(N no, S score) {
//        this.no = no;
//        this.score = score;
//    }
//    public N getNo() {
//        return no;
//    }
//    public void setNo(N no) {
//        this.no = no;
//    }
    public T getScore() {
        return score;
    }

    public void setScore(T score) {
        this.score = score;
    }

    @Override
    public int compareTo(Student<T> o) {
        return this.score.compareTo(o.score);
    }

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                '}';
    }
}
