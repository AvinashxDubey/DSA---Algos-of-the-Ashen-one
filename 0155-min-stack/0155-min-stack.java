class MinStack {
    Stack<int[]> minSt;
    public MinStack() {
        minSt = new Stack<>();
    }
    
    public void push(int val) {
        int min = Math.min(minSt.isEmpty()? val: minSt.peek()[1], val);
        int[] newArr =  {val, min};
        minSt.push(newArr);
    }
    
    public void pop() {
        if(!minSt.isEmpty()){
            minSt.pop();
        }
    }
    
    public int top() {
        return minSt.peek()[0];
    }
    
    public int getMin() {
        return minSt.peek()[1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */