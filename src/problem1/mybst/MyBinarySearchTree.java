/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree<E> implements BinarySearchTreeadt<E> {
        public int numberOfLeftChild = 0;
        private TreeNode<E> root;
        private int maxLevel = 0;

        @Override
        public boolean add(E data) {
                return false;
        }

        public TreeNode<E> getRoot() {
                return root;
        }


}
