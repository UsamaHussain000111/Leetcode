class MyQueue {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    public void push(int x) {
        stack1.push(x);
    }
    
    public int pop() {
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
    
    public int peek() {
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }
    
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */


 // using one stack

 
public class QueueUsingStack {
    private Stack<Integer> stack;

    public QueueUsingStack() {
        stack = new Stack<>();
    }

    public void enqueue(int value) {
        stack.push(value);
    }

    public int dequeue() {
        if (stack.size() == 1) {
            return stack.pop();
        }

        int value = stack.pop();
        int result = dequeue();
        stack.push(value);
        return result;
    }

    public int peek() {
        if (stack.size() == 1) {
            return stack.peek();
        }

        int value = stack.pop();
        int result = peek();
        stack.push(value);
        return result;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}