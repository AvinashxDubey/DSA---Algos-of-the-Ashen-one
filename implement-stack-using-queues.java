class MyStack {
    Queue<Integer> temp;
    public MyStack() {
        temp = new LinkedList<>();
    }
    public void push(int x) {

        temp.offer(x);
        for(int i=0; i<temp.size()-1; i++){
            temp.offer(temp.poll());
        }
    }
    
    public int pop() {
        return temp.poll();
    }
    
    public int top() {
        return temp.peek();
    }
    
    public boolean empty() {
        return temp.isEmpty();
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