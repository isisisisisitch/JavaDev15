package ca.bytetube._10_Interface;

public interface Eatable {
   public static final int age = 10;
  default   void eat(String name){
      System.out.println("Eatable - eat -" + name);

  }



    public static void main(String[] args) {
       // Eatable eatable = new Eatable();
    }


    
}
