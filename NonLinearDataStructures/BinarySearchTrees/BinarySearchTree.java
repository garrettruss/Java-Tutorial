package NonLinearDataStructures.BinarySearchTrees;

/*
A Binary Search Tree is an efficient value structure for fast (O(log N)) data storage and retrieval. It is a specialized tree data structure that is made up of a root node, and at most two child branches or subtrees. 

In this lesson’s implementation, each node will be an instance of the BinarySearchTree class. Each Binary Search Tree node has the following properties:

a value
a depth value, where a depth of 1 indicates the top level of the tree and a depth greater than 1 is a level somewhere lower in the tree
a left pointer that points to a left child which is itself a Binary Search Tree, and must have a data lesser than its parent node’s data
a right pointer that points to a right child which is itself a Binary Search Tree, and must have a data greater than or equal to its parent node’s data

When inserting a new value into a Binary Search Tree, we compare it with the root node’s value. We will implement an .insert() method in the BinarySearchTree class, assuming that we call the method from a root node like so:

rootNode.insert(aValue);
Here how we want the insertion to go:

If a new value is less than the current (root) node’s value, we want to insert it as a descendant on the left side.

If a left child to the current node doesn’t already exist, we create a new BinarySearchTree node with that value as this node’s left child.
If a left child already exists, we would call insert() recursively on the current node’s left child to insert further down.
If the new value is NOT less than the current (root) node’s value, we’ll want to insert it as a descendant on the right side! A similar logic applies:

If a right child to the current node doesn’t already exist, we create a new BinarySearchTree node with that value as this node’s right child.
If a right child already exists, we would call insert() recursively on the current node’s right child.
Let’s illustrate the insertion procedure with a tree whose root node has the data 100:

Insert 50
50 < 100, left child node doesn't exist, create a left child node with value 50 and depth 2
       100
       /
     50
Insert 125
125 > 100, right child node doesn't exist, create a right child node with value 100 and depth 2
        100
       /   \
      50    125
Insert 75
75 < 100, left child node of 50 exists, recursive insert at left child
75 > 50, right child node doesn't exist, create a right child node with value 75 and depth 3
        100
       /   \
      50    125
       \
       75
Insert 25
25 < 100, left child node of 50 exists, recursive insert at left child
25 < 50, left child node doesn't exist, create a left child node with value 75 and depth 3
        100
       /   \
      50    125
     /  \
    25  75
Note that we need to update the depth of each inserted node. To do so, we’ll add 1 to the current node’s depth when we insert a node as a left or right child.

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

    public void insert(int value) {
        if (value < this.value) {
            if (this.left == null) {
                this.left = new BinarySearchTree(value, this.depth + 1);
                System.out.printf("Tree node %d added to the left of %d at depth %d \n", value, this.value,
                        this.depth + 1);
            } else {
                this.left.insert(value);
            }
        } else {
            if (this.right == null) {
                this.right = new BinarySearchTree(value, this.depth + 1);
                System.out.printf("Tree node %d added to the right of %d at depth %d \n", value, this.value,
                        this.depth + 1);
            } else {
                this.right.insert(value);
            }
        }
    }

    /*
     * Binary Search Tree provides a fast and efficient way to store and retrieve
     * values. Like with .insert(), the procedure to retrieve a tree node by its
     * value is recursive. The base case for our recursive method is that when the
     * values match, we return the current node. The recursive step is for the
     * method to call itself from an existing left or right child node with the
     * value.
     * 
     * The base case for our recursive method is that when the values match, we
     * return the current node. The recursive step is for the method to call itself
     * from an existing left or right child node with the value.
     * 
     * If: target value is the same as the current node value Return the current
     * node Else if: target value is less than the current node's value and there is
     * a left child node Recursively search from the left child node Else if: target
     * value is greater than or equal to current node's value and there is a right
     * child node Recursively search from the right child node Else return null
     */

     public BinarySearchTree getNodeByValue(int value) {
        if (this.value == value) {
            return this;
        } else if (value < this.value && this.left != null) {
            return this.left.getNodeByValue(value);
        } else if (value > this.value && this.right != null) {
            return this.right.getNodeByValue(value);
        }
        return null;
    }

    public static void main(String[] args) {
        // Create a new BST:
        BinarySearchTree root = new BinarySearchTree(100);

        // Insert values below:
        root.insert(50);
        root.insert(125);
        root.insert(75);
        root.insert(25);

        /*
            100
            /   \
        50    125
        /  \
        25   75ß
        */

        // Get nodes by value below
        System.out.println(root.getNodeByValue(75)); 
        System.out.println(root.getNodeByValue(55));

    }
}