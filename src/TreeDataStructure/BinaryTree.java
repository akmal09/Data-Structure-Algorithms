package TreeDataStructure;

import SearchAlgorithm.BinarySearch;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    public TreeNode root;

    List<TreeNode> visitedNode;
    public BinaryTree(int val){
        TreeNode treeNode = new TreeNode(val);
        this.root = treeNode;
        this.visitedNode = new ArrayList<>();
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

    public void preorderTraversal(TreeNode treeNode){
        if(treeNode != null){
//            System.out.println(treeNode.val);
            System.out.print(Integer.toString(treeNode.val)+" ");
            if(treeNode.getLeft() != null){
                preorderTraversal(treeNode.getLeft());
            }
            if(treeNode.getRight() != null){
                preorderTraversal(treeNode.getRight());
            }
        }
    }

    public void postOrder(TreeNode treeNode){
        if(treeNode != null){
            if(treeNode.getLeft() != null){
                postOrder(treeNode.getLeft());
            }

            if(treeNode.getRight() != null){
                postOrder(treeNode.getRight());
            }
            System.out.print(Integer.toString(treeNode.val)+" ");
        }
    }
}
