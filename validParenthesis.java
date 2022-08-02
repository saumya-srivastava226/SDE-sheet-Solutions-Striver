import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        
        if(s.charAt(0)=='}'||s.charAt(0)==')'||s.charAt(0)==']')
            return false;
        
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='['||s.charAt(i)=='{'||s.charAt(i)=='(')
                st.push(s.charAt(i));
            
            
            if(st.isEmpty()==true)// you have not encoounter any openning bracket that                               
                //means only closing bracket are there
                return false;
            char check;
            
            switch(s.charAt(i))
            {
                case')': check=st.pop();
                if(check=='{'||check=='[')
                    return false;
                    break;
                case'}': check=st.pop();
                if(check=='('||check=='[')
                    return false;
                    break;
                    
                  case']': check=st.pop();
                if(check=='{'||check=='(')
                    return false;
                    break;    
                    
            }
        }
        if(st.isEmpty())
            return true;
        return false;
        
    }
}
