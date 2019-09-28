package LeetCode.Easy;

import java.util.LinkedList;
import java.util.Queue;

public class LC225 {

    private Queue<Integer> queue;

    public LC225() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
        int size = queue.size();
        while (size-- > 1){
            queue.add(queue.poll());
        }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
