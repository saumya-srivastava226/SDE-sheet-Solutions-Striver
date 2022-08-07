import java.util.*;
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        Queue<TreeNode> q= new LinkedList<>();
        List<List<Integer>> ans=new LinkedList<List<Integer>>();
        
        if(root==null)
            return ans;
        q.add(root);
        while(!q.isEmpty())
        {
            int levelNum=q.size();
           // TreeNode temp=q.poll();
            List<Integer> sublist=new ArrayList<Integer>();
            for(int i=0;i<levelNum;i++)
            {
                if(q.peek().left!=null)
                    q.add(q.peek().left);
                if(q.peek().right!=null)
                    q.add(q.peek().right);
                
                sublist.add(q.poll().val);
            }
            ans.add(sublist);
            
        }
        return ans;
        
    }
}
