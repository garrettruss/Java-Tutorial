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
     * 
     * What is the time complexity for .insert() and .getNodeByValue() performed on
     * an average, relatively balanced, Binary Search Tree with N values? For an
     * average Binary Search Tree, the depth of the tree is log(N), and the methods
     * make O(1) comparisons until the value is found at one of the depths.
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

    /*
     * There are two main ways of traversing a binary tree: breadth-first and
     * depth-first. With breadth-first traversal, we begin traversing at the top of
     * the tree’s root node, displaying its value and continuing the process with
     * the left child node and the right child node. Descend a level and repeat this
     * step until we finish displaying all the child nodes at the deepest level from
     * left to right.
     * 
     * With depth-first traversal, we always traverse down each left-side branch of
     * a tree fully before proceeding down the right branch. However, there are
     * three traversal options:
     * 
     * Preorder is when we perform an action on the current node first, followed by
     * its left child node and its right child node Inorder is when we perform an
     * action on the left child node first, followed by the current node and the
     * right child node Postorder is when we perform an action on the left child
     * node first, followed by the right child node and then the current node
     * 
     * For this lesson, we will implement the inorder option. The advantage of this
     * option is that the value is displayed in sorted order from the smallest to
     * the biggest.
     * 
     * To illustrate, let’s say we have a binary tree that looks like this:
     * 
     * 15 /------+-----\ 12 20 / \ / \ 10 13 18 22 / \ / \ / \ / \ 8 11 12 14 16 19
     * 21 25 We begin by traversing the left subtree at each level, which brings us
     * to 8, 10, and 11 reside. The inorder traversal would be:
     * 
     * 8, 10, 11 We ascend one level up to visit root node 12 before we descend back
     * to the bottom where the right subtree of 12, 13, and 14 resides. Inorder
     * traversal continues with:
     * 
     * 12, 12, 13, 14 We again ascend one level up to visit root node 15 before we
     * traverse the right subtree starting at the bottom level again. We continue
     * with the bottom leftmost subtree where 16, 18, and 19 reside. The inorder
     * traversal continues with:
     * 
     * 15, 16, 18, 19 We ascend one level up to visit root node 20 before we descend
     * back to the bottom where the rightmost subtree of 21, 22, and 25 resides.
     * 
     * Traversal finishes with:
     * 
     * 20, 21, 22, 25 The entire traversal becomes:
     * 
     * 8, 10, 11, 12, 12, 13, 14, 15, 16, 18, 19, 20, 21, 22, 25 Notice that all the
     * values displayed are sorted in ascending order.
     * 
     * Let’s implement a method that prints the inorder traversal for the
     * BinarySearchTree class!
     */
        public void depthFirstTraversal() {
        if (this.left != null) {
            this.left.depthFirstTraversal();
        }
        System.out.println(this.value);
        if (this.right != null) {
            this.right.depthFirstTraversal();
        }
     }

    public static void main(String[] args) {
        System.out.println("Creating Binary Search Tree rooted at value 15:");
        BinarySearchTree tree = new BinarySearchTree(15);

        for (int i = 0; i < 10; i++) {
            tree.insert((int) (Math.random() * 100));
        }

        System.out.println("Printing the inorder depth-first traversal:");
        tree.depthFirstTraversal();

    }
}