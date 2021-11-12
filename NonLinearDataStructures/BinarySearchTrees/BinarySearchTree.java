package NonLinearDataStructures.BinarySearchTrees;

/*
A Binary Search Tree is an efficient value structure for fast (O(log N)) data storage and retrieval. It is a specialized tree data structure that is made up of a root node, and at most two child branches or subtrees. 

In this lesson’s implementation, each node will be an instance of the BinarySearchTree class. Each Binary Search Tree node has the following properties:

a value
a depth value, where a depth of 1 indicates the top level of the tree and a depth greater than 1 is a level somewhere lower in the tree
a left pointer that points to a left child which is itself a Binary Search Tree, and must have a data lesser than its parent node’s data
a right pointer that points to a right child which is itself a Binary Search Tree, and must have a data greater than or equal to its parent node’s data

*/

public class BinarySearchTree {
    public int value;
    public int depth;
    public BinarySearchTree left;
    public BinarySearchTree right;

    public BinarySearchTree(int value, int depth) {
        this.value = value;
        this.depth = depth;
        this.left = null;
        this.right = null;
    }

    public BinarySearchTree(int value) {
        this.value = value;
        this.depth = 1;
        this.left = null;
        this.right = null;
    }

    public static void main(String[] args) {
        // Create a new BST:
        BinarySearchTree bt = new BinarySearchTree(15);
        // Print bt's value below:
        System.out.print(bt.value);

    }
}