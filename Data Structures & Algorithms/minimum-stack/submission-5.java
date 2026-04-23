class MinStack {
    Deque<Long> stack ;
    long min;
    public MinStack() {
        stack = new ArrayDeque<>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            min = val;
            stack.push((long) val);
        }else if(val >= min){
            stack.push((long) val);
        }else{
            stack.push(2L * val - min);
            min = val;
        }
    }
    
    public void pop(){
        long top = stack.pop();
        if(top < min){
            min = 2 * min - top;
        }
    }
    
    public int top() {
        long top = stack.peek();
        if(top < min) return (int) min;
        return (int) top;
    }
    
    public int getMin() {
        return (int) min;
    }
}
