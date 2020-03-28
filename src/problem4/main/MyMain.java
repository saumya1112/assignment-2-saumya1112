/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;


import problem4.mybst.BinarySearchTree;
import problem4.myqueue.MyQueue;
import problem4.myqueue.TreeNode;

import java.util.Scanner;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearchTree myBinarySearchTree = new BinarySearchTree();
        MyQueue myQueue = new MyQueue();
        TreeNode root = new TreeNode(20);
        myBinarySearchTree.insert(root, 2);
        myBinarySearchTree.insert(root, 65);
        myBinarySearchTree.insert(root, 34);
        myBinarySearchTree.insert(root, 10);
        myBinarySearchTree.insert(root, 9);
        myBinarySearchTree.insert(root, 32);
        myBinarySearchTree.insert(root, 30);
        myBinarySearchTree.insert(root, 25);
        myBinarySearchTree.insert(root, 44);
        myBinarySearchTree.insert(root, 76);
        myBinarySearchTree.insert(root, 6);
        myQueue.preOrder(root);
        myQueue.queuePrint(myQueue);
        System.out.print("Enter value of which you want to find preOrder Successor : ");
        myQueue.printSuccessor(scanner.nextInt());
    }
}
