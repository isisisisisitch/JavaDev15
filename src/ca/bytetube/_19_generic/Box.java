package ca.bytetube._19_generic;

public class Box<E> {
    private E element;

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public void add(Class<E> cls) throws IllegalAccessException, InstantiationException {
       // E e1 = new E();//.java
        E e = cls.newInstance();//.class--->exe

        //...

    }
}
