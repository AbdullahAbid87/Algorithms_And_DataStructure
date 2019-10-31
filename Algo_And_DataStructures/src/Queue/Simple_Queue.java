/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

import java.util.Arrays;

/**
 *
 * @author Abdullah
 */
public class Simple_Queue {

    private static int A[];
    private static int front;
    private static int Rear;

    public static void main(String[] args) {
        Simple_Queue SQ = new Simple_Queue();
        front = 0;
        Rear = 0;
        A = new int[3];

        enqueue(1);
        System.out.println(Arrays.toString(A));
        enqueue(2);
        System.out.println(Arrays.toString(A));
        enqueue(3);
        System.out.println(Arrays.toString(A));
        enqueue(4);
        System.out.println(Arrays.toString(A));

    }

    public static void enqueue(int x) {
        if (!isFull()) {
            A[Rear] = x;
            Rear++;
        } else {
            System.out.println("IS FULL");
        }
    }

    public static void dequeue() {
        if (!isEmpty()) {
            for (int i = 0; i < Rear; i++) {
                A[i] = A[i + 1];
            }
            Rear--;
        }else {
            System.out.println("IS Empty");
        }

    }

    public static int getfront() {
        return A[0];
    }

    //Overflow Check
    public static boolean isFull() {
        if (A.length == Rear) {
            return true;
        } else {
            return false;
        }
    }

    // UnderFlow Check
    public static boolean isEmpty() {
        if (Rear == 0) {
            return true;
        } else {
            return false;
        }
    }
}
