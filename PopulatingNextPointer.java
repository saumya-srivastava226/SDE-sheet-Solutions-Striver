class Solution {
    
    
    
    public Node connect(Node root) {
        
        Node first= root;
        
        while(first!=null&&first.left!=null)
        {
            Node ptr=first;
            
            while(true)
            {
                ptr.left.next=ptr.right;
                if(ptr.next==null)
                    break;
                ptr.right.next=ptr.next.left;
                ptr=ptr.next;
            }
            first=first.left;
        }
        
        return root;
    }
}
