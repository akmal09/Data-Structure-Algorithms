package DataStructure;

public class TreeNode {
    public int val;

    private TreeNode left;
    private TreeNode right;

    public TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public void insert(TreeNode node, int val) {
        if (val < node.getVal()) {
            if (node.getLeft() == null) {
                node.setLeft(new TreeNode(val));
            } else {
                insert(node.getLeft(), val);
            }
        } else {
            if (node.getRight() == null) {
                node.setRight(new TreeNode(val));
            } else {
                insert(node.getRight(), val);
            }
        }
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

    public void print(){
        inOrderPrint(this);
    }

    public void inOrderPrint(TreeNode node) {
        if (node != null) {
            inOrderPrint(node.getLeft());
            System.out.print(node.getVal() + " ");
            inOrderPrint(node.getRight());
        }
    }
}
