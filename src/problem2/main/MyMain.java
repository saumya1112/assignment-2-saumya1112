/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        Traverse prePostOrder = new Traverse();
        prePostOrder.insert(100);
        prePostOrder.insert(200);
        prePostOrder.insert(300);
        prePostOrder.insert(400);
        prePostOrder.insert(500);
        prePostOrder.insert(600);
        prePostOrder.insert(700);
        prePostOrder.insert(800);
        System.out.println("PreOrder traverse :");
    }
}

