class MyQueue {
   private Stack<Integer> st;
   private Stack<Integer> st1;
    public MyQueue() {
        st=new Stack<>();
        st1=new Stack<>();
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        move();
     return st1.pop();   
    }
    
    public int peek() {
        move();
        return st1.peek();
    }
    
    public boolean empty() {
        return st1.isEmpty() && st.isEmpty();
    }
    private void move(){
       if (st1.isEmpty()) {
            while (!st.isEmpty()) {
                st1.push(st.pop());
            }
        }
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