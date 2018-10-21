package leetcode.easy;

import java.util.Stack;

public class MinStack {
    Stack<Integer> minStack= new Stack<>();
    
    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(x);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.getMin();
     */
    public MinStack() {
        
    }
    
    public void push(int x) {
        this.minStack.push(x);
    }
    
    public void pop() {
        this.minStack.pop();
    }
    
    public int top() {
        return this.minStack.peek();
        
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i = this.minStack.size() - 1; i >= 0 ; i --) {
            if(this.minStack.get(i) <  min) {
                min = this.minStack.get(i);
            }
            
        }
        return min;
        
    }
}
