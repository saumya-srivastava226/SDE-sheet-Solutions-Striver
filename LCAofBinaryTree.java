class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root==null||root==p||root==q)
            return root;
        
        
        TreeNode leftSubtree=lowestCommonAncestor(root.left,p,q);
        TreeNode rightSubtree=lowestCommonAncestor(root.right,p,q);
        if(leftSubtree==null)
            return rightSubtree;
        else if(rightSubtree==null)
            return leftSubtree;
        else
            return root;
        
        
        
        
    }
}
