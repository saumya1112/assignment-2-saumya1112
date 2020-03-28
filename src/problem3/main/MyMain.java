/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem3.student.student;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue<student> myPriorityQueue = new MyPriorityQueue<>();
        myPriorityQueue.add(new student(1, "Saumya"));
        myPriorityQueue.add(new student(2, "Vanshika"));
        myPriorityQueue.add(new student(3, "Simran"));
        myPriorityQueue.add(new student(4, "Mani"));
        myPriorityQueue.add(new student(5, "Bhoomi"));
        System.out.println(myPriorityQueue);
    }
}
