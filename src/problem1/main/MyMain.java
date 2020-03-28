/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

//import problem1.mybst.MyBinarySearchTree;

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree<Integer> myBinarySearchTree = new MyBinarySearchTree<>();
        myBinarySearchTree.add(10);
        myBinarySearchTree.add(20);
        myBinarySearchTree.add(30);
        myBinarySearchTree.add(40);
        myBinarySearchTree.add(50);
        myBinarySearchTree.print();
        myBinarySearchTree.print();
        System.out.println("Number of nodes who does not have a left Child : " + myBinarySearchTree.numberOfLeftChild);

    }
}
