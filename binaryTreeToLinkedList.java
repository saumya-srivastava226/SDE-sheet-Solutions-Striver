class Solution {
    public TreeNode flattenHelper(TreeNode root) {
        if(root==null)
            return null;
        
        TreeNode leftHead=flattenHelper(root.left);
        TreeNode rightHead=flattenHelper(root.right);
        
        if(leftHead!=null&&rightHead!=null)
        {
            TreeNode temp=leftHead;
            while(temp.right!=null)
            {
                temp=temp.right;
            }
            temp.right=rightHead;
            root.right=leftHead;
            root.left=null;
            return root;
        }
        else if(leftHead==null)
            return root;
        else if(rightHead==null)
        {
            root.left=null;
            root.right=leftHead;
            return root;
        }
        return root;
        
    }
    public void flatten(TreeNode root)
    {
        if(root==null)
            return;
        TreeNode node=flattenHelper(root);
        System.out.print(node.val);
        flatten(node.left);
        flatten(node.right);
        return;
    }
        
}
