package ca.bytetube._12_anonymous;

public class Times {

    interface Task {

        public void execute();

    }


    public static void calDuration(Task task){
        long begin = System.currentTimeMillis();
        task.execute();
        long end = System.currentTimeMillis();

        double duration = (end - begin)/1000;
        System.out.println(duration);
    }
}
