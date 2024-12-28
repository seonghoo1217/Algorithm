package buzzvil;

import java.util.Stack;

public class TwoStackOneQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public TwoStackOneQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // 큐에 상빕
    public void enqueue(int x) {
        stack1.push(x);
    }

    // 큐에서 제거
    public int dequeue() {
        if (stack2.isEmpty()) {
            moveElements();
        }
        if (stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return stack2.pop();
    }

    // 큐의 가장 앞에 있는 요소를 확인
    public int peek() {
        if (stack2.isEmpty()) {
            moveElements();
        }
        if (stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return stack2.peek();
    }

    // 큐가 비어있는지 확인
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    // stack1의 요소를 stack2로 이동
    private void moveElements() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }


    public static void main(String[] args) {
        TwoStackOneQueue twoStackOneQueue = new TwoStackOneQueue();
        twoStackOneQueue.enqueue(1);
        twoStackOneQueue.enqueue(2);
        twoStackOneQueue.enqueue(3);


        twoStackOneQueue.dequeue();

        assert twoStackOneQueue.peek() == 2 : "Expected 2 but got " + twoStackOneQueue.peek();
    }
}
