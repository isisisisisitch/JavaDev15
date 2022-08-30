package ca.bytetube._22_concurrent;

public class DeadLock {
    public static void main(String[] args) {
        new Thread(() -> {//J
            synchronized ("1"){
                System.out.println("1-1");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized ("2"){
                    System.out.println("1-2");
                }


            }

        }).start();

        new Thread(() -> {//K
            synchronized ("2"){
                System.out.println("2-1");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized ("1"){
                    System.out.println("2-2");
                }


            }
        }).start();

    }



}
