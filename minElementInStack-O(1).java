import java.util.Stack;

class MinStack {

    Stack<Integer> st;
    int minElement;
    public MinStack() {
        
        st=new Stack<Integer>();
        minElement=Integer.MAX_VALUE;
        
    }
    
    public void push(int val) {
        
        // if this is the first element
        
        if(st.size()==0)
        {
            st.push(val);
            minElement=val;
        }
        else
        {
            if(val>=minElement)
            {
                st.push(val);
            }
            else if(val<minElement)
            {
                st.push(2*val-minElement);
                minElement=val;
            }
        }
        
        
        
    }
    
    public void pop() {
        
        
        if(st.size()==0)
            return;
        else
        {
            if(st.peek()>=minElement)
            {
                st.pop();
            }
            else if(st.peek()<minElement)
            {
                minElement=2*minElement-st.peek();
                st.pop();
            }
        }
        
        
        
        
        
        
        
        
        
    }
    
    public int top() {
        
        if(st.size()==0)
            return -1;
        else
        {
            if(st.peek()>=minElement)
                return st.peek();
            else
                return minElement;
        }
        
        
    }
    
    public int getMin() {
        
        if(st.size()==0)
            return -1;
        return minElement;
    }
}
