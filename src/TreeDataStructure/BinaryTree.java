package TreeDataStructure;

import SearchAlgorithm.BinarySearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import DataStructure.TreeNode;

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

    public TreeNode deleteNode(int deletedVal,TreeNode treeNode){
        if(deletedVal > treeNode.val){
            treeNode.setRight(deleteNode(deletedVal, treeNode.getRight()));
        }else if(deletedVal < treeNode.val){
            treeNode.setLeft(deleteNode(deletedVal, treeNode.getLeft()));
        }else{
            return processDelete(deletedVal, treeNode);
        }
        return treeNode;
    }

    private TreeNode processDelete(int deletedVal, TreeNode nodeWillDelete){
        if(nodeWillDelete.getLeft() == null && nodeWillDelete.getRight() == null) return null;

        if(nodeWillDelete.getLeft() == null){
            return nodeWillDelete.getRight();
        }
        if(nodeWillDelete.getRight() == null){
            return nodeWillDelete.getLeft();
        }
        TreeNode leftDeepNode = findDeepLeft(nodeWillDelete.getRight());

        nodeWillDelete.setVal(leftDeepNode.val);
        nodeWillDelete.setRight(deleteNode(leftDeepNode.val, nodeWillDelete.getRight()));

        return nodeWillDelete;
    }

    private TreeNode findDeepLeft(TreeNode node){
        if(node.getLeft() == null) return node;
        return findDeepLeft(node.getLeft());
    }
    
    public TreeNode deleteNodeGpt(int deletedVal, TreeNode treeNode){
        if (treeNode == null) return null;

        if (deletedVal > treeNode.val) {
            treeNode.setRight(deleteNodeGpt(deletedVal, treeNode.getRight()));
        } else if (deletedVal < treeNode.val) {
            treeNode.setLeft(deleteNodeGpt(deletedVal, treeNode.getLeft()));
        } else {
            // Found the node to delete
            return processDeleteGpt(deletedVal, treeNode, null, null);
        }
        return treeNode;
    }

    private TreeNode processDeleteGpt(int deletedVal, TreeNode nodeWillDelete, TreeNode parentDeletedTree, String whichChild) {
        // Case 1: No child
        if (nodeWillDelete.getLeft() == null && nodeWillDelete.getRight() == null) {
            return null;
        }
        // Case 2: One child
        if (nodeWillDelete.getLeft() == null) {
            return nodeWillDelete.getRight();
        } else if (nodeWillDelete.getRight() == null) {
            return nodeWillDelete.getLeft();
        }
        // Case 3: Two children
        // Replace with smallest value in right subtree
        TreeNode minNode = findMin(nodeWillDelete.getRight());
        nodeWillDelete.setVal(minNode.getVal());
        nodeWillDelete.setRight(deleteNodeGpt(minNode.getVal(), nodeWillDelete.getRight()));
        return nodeWillDelete;
    }

    private TreeNode findMin(TreeNode node) {
        while (node.getLeft() != null) {
            node = node.getLeft();
        }
        return node;
    }

}
