import java.util.Queue;
import java.util.LinkedList;
class MyStack {

    Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack() {
        q1= new LinkedList<>();
        q2=new LinkedList<>();
    }
    
    public void push(int x) {
        
        while(!q1.isEmpty())
        {
            q2.add(q1.poll());
        }
        q1.add(x);
        while(!q2.isEmpty())
        {
            q1.add(q2.poll());
        }
        
        
    }
    
    public int pop() {
        
        if(q1.isEmpty())
            return -1;
        else
            return q1.poll();
        
    }
    
    public int top() {
        if(q1.isEmpty())
            return -1;
        
        return q1.peek();
        
    }
    
    public boolean empty() {
        if(q1.size()==0)
            return true;
        return false;
        
    }
}
