package ca.bytetube._22_concurrent;

public class ProducerAndConsumer {
    public static void main(String[] args) {
        Drop drop = new Drop();
        new Thread(new Producer(drop)).start();
        new Thread(new Consumer(drop)).start();

    }
}
