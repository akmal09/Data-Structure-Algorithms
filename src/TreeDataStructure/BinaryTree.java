package TreeDataStructure;

import SearchAlgorithm.BinarySearch;

public class BinaryTree {
    public TreeNode root;

    public BinaryTree(int val){
        TreeNode treeNode = new TreeNode(val);
        this.root = treeNode;
    }

    public void insertTree(int data, TreeNode treeNode){

        if(data < treeNode.getVal()){
            if(treeNode.getLeft() == null){
                TreeNode newTreeNode = new TreeNode(data);
                treeNode.setLeft(newTreeNode);
            }else {
                insertTree(data, treeNode.getLeft());
            }
        }else{
            if(treeNode.getRight() == null){
                TreeNode newTreeNode = new TreeNode(data);
                treeNode.setRight(newTreeNode);
            }else {
                insertTree(data, treeNode.getRight());
            }
        }
    }

    public void inorderTraversalTree(TreeNode treeNode){
        if(treeNode != null){
//            System.out.println(treeNode.val);
            if(treeNode.getLeft() != null){
                inorderTraversalTree(treeNode.getLeft());
            }

            System.out.print(Integer.toString(treeNode.val)+" ");

            if(treeNode.getRight() != null){
                inorderTraversalTree(treeNode.getRight());
            }

        }
    }
}
