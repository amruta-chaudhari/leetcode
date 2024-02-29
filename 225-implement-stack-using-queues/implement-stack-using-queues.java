class MyStack {

    Queue<Integer> que1;
    Queue<Integer> que2;

    public MyStack() {
        que1 = new LinkedList<>();
        que2 = new LinkedList<>();
    }
    
    public void push(int x) {
        que2.add(x);
        while(!que1.isEmpty()){
            que2.add(que1.remove());
        }

        Queue<Integer> temp = que1;
        que1 = que2;
        que2 = temp;
    }
    
    public int pop() {
        return que1.remove();
    }
    
    public int top() {
        return que1.peek();
    }
    
    public boolean empty() {
        return que1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */