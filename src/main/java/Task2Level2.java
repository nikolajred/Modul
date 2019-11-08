public class Task2Level2 {

    public int maxDepthTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int ld=maxDepthTree(root.left);
        int rd=maxDepthTree(root.right);

        return Math.max(ld,rd)+1;
    }
     class TreeNode {
     int val;
     TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
  }
}
