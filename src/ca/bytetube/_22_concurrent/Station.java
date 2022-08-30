package ca.bytetube._22_concurrent;

public class Station implements Runnable {
    private static int tickets = 100;

    public synchronized boolean sellTickets(){

            if (tickets < 1) return false;
            tickets--;
            String name = Thread.currentThread().getName();
            System.out.println(name +" sold a ticket and remaining "+ tickets);

            return tickets > 0;

    }

    public static synchronized boolean sellTickets1(){

        if (tickets < 1) return false;
        tickets--;
        String name = Thread.currentThread().getName();
        System.out.println(name +" sold a ticket and remaining "+ tickets);

        return tickets > 0;

    }

    @Override
    public void run() {
        while (sellTickets());

    }
}
