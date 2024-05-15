package TreeDataStructure;

public class TreeNode {
    public int val;

    private TreeNode left;
    private TreeNode right;

    public TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int value){
        this.val = value;
    }

    public void setLeft(TreeNode data) {
        this.left = data;
    }
    public TreeNode getLeft() {
        return this.left;
    }

    public void setRight(TreeNode data){
        this.right = data;
    }
    public TreeNode getRight(){
        return this.right;
    }
}
