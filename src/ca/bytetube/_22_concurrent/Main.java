package ca.bytetube._22_concurrent;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        Thread thread = Thread.currentThread();
//        System.out.println(thread);//Thread[main,5,main]
////        Thread thread = new Thread();
////        //在java中，线程的执行方式是抢占式
////        thread.setPriority(10);

//        test3();
        test4();
    }

    public static void test4(){
        Station station = new Station();
        for (int i = 1; i <= 4; i++) {
            Thread thread = new Thread(station);
            thread.setName("Thread-" + i);
            thread.start();

        }
    }


    public static void test3() throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }

                System.out.println(2);
            }
        });

        thread.start();
        thread.join();
        //Thread.sleep(1000);
        System.out.println(3);
        //thread.interrupt();
    }


    public static void test2() {
        Thread thread = new MyThread();//ebp mov 10h  ,esp
        thread.start();//create a thread :Thread-0
        //thread.run();//create a thread :main
        System.out.println(thread.getState());
        //RUNNABLE分成2种情况
        //running ready
    }

    public static void test1() {
        //task
        Thread thread = new Thread(() -> System.out.println("create a thread :" + Thread.currentThread().getName()));

        thread.start();//当Thread调用start方法后，内部会自动调用run方法


        Thread thread2 = new Thread(new MyTask());

        thread2.start();
    }


}
