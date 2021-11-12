package NonLinearDataStructures.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    public TreeNode root;

    public Tree(TreeNode root) {
        this.root = root;
    }

    public void print() {
        print(this.root, 0);
    }

    public void print(TreeNode current, int level) {
        String levelMarks = "";
        for (int i = 0; i < level; i++) {
            levelMarks += "-- ";
        }
        System.out.println(levelMarks + current.data);
        for (TreeNode child : current.children) {
            print(child, level + 1);
        }
    }

    /*
     * Depth-first-search (DFS) is a technique that visits the first child in the
     * children list and that node’s children recursively before visiting all the
     * first child’s siblings and then their children recursively.
      */

      public void depthFirstTraversal(TreeNode current) {
        System.out.print(current.data + " ");
        for (TreeNode child : current.children) {
            depthFirstTraversal(child);
        }
    }

    /*
     * Breadth-first-search (BFS) is a technique in a tree that visits all children
     * of a node first before visiting any further levels.
     * 
     * Notice that the root comes first, then all nodes in the first level next,
     * then all nodes in the second level.
     * 
     */
    public void breadthFirstTraversal() {
        TreeNode current = this.root;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(current);
        while (!queue.isEmpty()) {
            current = queue.poll();
            System.out.print(current.data + " ");
            queue.addAll(current.children);
        }
    }



    public static void main(String[] args) {
        TreeNode treeRoot = new TreeNode("S");
        TreeNode child1 = new TreeNode("N");
        TreeNode child2 = new TreeNode("O");
        TreeNode grandchild1 = new TreeNode("W");
        TreeNode grandchild2 = new TreeNode("Y");
        // addChild operations below
        treeRoot.addChild(child1);
        treeRoot.addChild(child2);
        child1.addChild(grandchild1);
        child2.addChild(grandchild2);
        // Create tree
        Tree tree = new Tree(treeRoot);
        // Print tree
        tree.print();

        // Remove grandchild2 from the tree
        treeRoot.removeChild(grandchild2);

        // Print the tree
        tree.print();

        // Remove "O" from the tree
        treeRoot.removeChild("O");

        // Print the tree again
        tree.print();

        tree.depthFirstTraversal(treeRoot);

        tree.breadthFirstTraversal();

    }
}