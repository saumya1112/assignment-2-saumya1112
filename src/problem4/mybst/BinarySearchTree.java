package problem4.mybst;


import problem4.myqueue.TreeNode;

import java.util.Queue;

public class BinarySearchTree {
    static Queue<TreeNode> q;

    public TreeNode insert(TreeNode root, int x) {
        if (root == null)
            return new TreeNode(x);
        else if (x > (int) root.getData())
            root.setRight(insert(root.getRight(), x));
        else
            root.setLeft(insert(root.getLeft(), x));
        return root;
    }
}
