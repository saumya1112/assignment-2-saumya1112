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

                return true;
        }

        public TreeNode<E> getRoot() {
                return root;
        }

        private TreeNode<E> addRecursive(TreeNode<E> currentNode, E data) {
                if (currentNode == null) {
                        return new TreeNode<>(data);
                } else if ((Integer) data < (Integer) currentNode.getData()) {
                        currentNode.setLeft(addRecursive(currentNode.getLeft(), data));
                } else if ((Integer) data > (Integer) currentNode.getData()) {
                        currentNode.setRight(addRecursive(currentNode.getRight(), data));
                }
                return currentNode;
        }

        private void printLeftChild(TreeNode<E> node, int level) {
                if (node == null) {
                        return;
                }
                if (maxLevel < level) {
                        System.out.println(node.getData() + " ");
                }
                maxLevel = level;
                if ((node.getLeft() == null)) {
                        numberOfLeftChild++;
                        maxLevel++;
                }
                printLeftChild(node.getLeft(), level + 1);
                printLeftChild(node.getRight(), level + 1);
        }


}
