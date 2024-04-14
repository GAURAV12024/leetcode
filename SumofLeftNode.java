class Solution {

    int sum=0;

    public void sum(TreeNode root){
        if(root==null){
            return ;
        }

        if(root.left!=null){
            TreeNode y=root.left;
            if(y.left==null && y.right==null){
                sum+=y.val;
            }
        }

        sum(root.left);
        sum(root.right);
    }
    public int sumOfLeftLeaves(TreeNode root) {
       sum(root);

       return sum;
    }
}
