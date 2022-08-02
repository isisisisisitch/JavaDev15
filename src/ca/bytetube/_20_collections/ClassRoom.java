package ca.bytetube._20_collections;

import java.util.Iterator;

public class ClassRoom implements Iterable<String>{
    private String[] students;

    public ClassRoom(String... students) {
        this.students = students;
    }

    public String[] getStudents() {
        return students;
    }

    public void setStudents(String[] students) {
        this.students = students;
    }


    @Override
    public Iterator<String> iterator() {
        return new ClassRoomIterator();
    }

    private class ClassRoomIterator implements Iterator<String>{
      private  int cursor;
        @Override
        public boolean hasNext() {
            return cursor != students.length;
        }

        @Override
        public String next() {
            return students[cursor++];
        }
    }

}
