package ca.bytetube._22_concurrent;

public class Consumer implements Runnable {
    private Drop drop;


    public Consumer(Drop drop) {
        this.drop = drop;
    }

    @Override
    public void run() {

        String food = null;
        while ( (food = drop.get()) != null){
            System.out.println("received food : " + food);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
