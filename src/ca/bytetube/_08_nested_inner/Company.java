package ca.bytetube._08_nested_inner;

public class Company {
    private String name;


    public Company(String name) {
        this.name = name;
    }

    public void fire(Employee e){
        System.out.println(e.no);

    }


    public class Employee{
        private int no;

        public void show(){
            System.out.println(name);
        }
    }
}
