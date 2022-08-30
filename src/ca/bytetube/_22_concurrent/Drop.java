package ca.bytetube._22_concurrent;

public class Drop {
    private String food;
    //empty = true:消费者需要等待生产者生成food
    //empty = false:food已经生产完毕，生产者还要登台消费者消费food
    private boolean empty = true;

    public synchronized String get() {
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        empty = true;
        notifyAll();
        return food;

    }

    public synchronized void add(String food) {
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        empty = false;
        this.food = food;
        notifyAll();
    }


}
