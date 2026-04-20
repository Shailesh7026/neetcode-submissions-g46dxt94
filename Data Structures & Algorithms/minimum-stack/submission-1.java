class MinStack {
    List<Integer> list;
    Stack<Integer> stack ;
    public MinStack() {
        list = new ArrayList<>();
        stack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(list.isEmpty()){
            list.add(val);
        }else{   
            list.add(Math.min(val, list.get(list.size() - 1)));
        }
    }
    
    public void pop() {
        stack.pop();
        list.remove(list.size() - 1);
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return list.get(list.size() - 1);
    }
}
