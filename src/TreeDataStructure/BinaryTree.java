package TreeDataStructure;

import SearchAlgorithm.BinarySearch;

import java.time.temporal.Temporal;

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

    public void remove(int val){
//        System.out.println("output->"+this.root.getVal());
        this.root = removeNodeByMe(val,this.root);
        System.out.println("\noutput->"+this.root.getVal());
//        this.root = removeNode(this.root,val);
    }

    private TreeNode removeNodeByMe(int val, TreeNode node){
        if(node == null){
            return node;
        }

        if(val<node.getVal()){
            node.setLeft(removeNodeByMe(val, node.getLeft()));
        }else if(val>node.getVal()){
            node.setRight(removeNodeByMe(val, node.getRight()));
        }else{
            if(node.getRight() == null){
                return node.getLeft();
            }else if(node.getLeft() == null){
                return node.getRight();
            }

            TreeNode successor = findMin(node.getRight());
            node.setVal(successor.getVal());
            node.setRight(removeNodeByMe(successor.getVal(), node.getRight()));
        }

        return node;
    }

    private TreeNode findMin(TreeNode node){
        if(node.getLeft() != null){
            return findMin(node.getLeft());
        }
        return node;
    }
}
