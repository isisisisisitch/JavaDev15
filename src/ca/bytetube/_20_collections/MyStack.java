package ca.bytetube._20_collections;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    private Queue<Integer> data;
    private Queue<Integer> help;

    public MyStack() {
        data = new LinkedList<>();
        help = new LinkedList<>();
    }

    public void push(int x) {
        data.offer(x);

    }

    public int pop() {
        //1.依次弹出data中前n-1个元素，弹出的元素装入help中
        while (data.size() > 1)  help.offer(data.poll());

        //2.只剩最后一个元素
        Integer last = data.poll();

        swap();

        return last;

    }



    public int top() {

        //1.依次弹出data中前n-1个元素，弹出的元素装入help中
        while (data.size() > 1)  help.offer(data.poll());

        //2.只剩最后一个元素
        Integer last = data.poll();
        help.offer(last);
        swap();

        return last;
    }

    public boolean empty() {

      return  data.isEmpty() && help.isEmpty();

    }

    private void swap() {
        Queue<Integer> temp = help;
        help = data;
        data = temp;
    }
}
