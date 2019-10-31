/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

import static Queue.Variable_front_Queue.A;
import static Queue.Variable_front_Queue.Dequeue;
import static Queue.Variable_front_Queue.Enqueue;
import static Queue.Variable_front_Queue.Front;
import static Queue.Variable_front_Queue.Rear;
import java.util.Arrays;

/**
 *
 * @author Abdullah
 */
public class Circular_Queue {

    public static int Rear;
    public static int Front;
    public static int A[];
    public static int c;
    public static void main(String[] args) {
        A = new int[3];
        Enqueue(1);
        System.out.println(Arrays.toString(A));
        Enqueue(2);
        System.out.println(Arrays.toString(A));
        Enqueue(3);
        System.out.println(Arrays.toString(A));
       
        Enqueue(4);
        System.out.println(Arrays.toString(A));
         Dequeue();
         System.out.println(Arrays.toString(A));
         Enqueue(5);
        System.out.println(Arrays.toString(A));
    

    }

    public static void Enqueue(int x) {

        if (!isFull()) { //Start if
            A[Rear] = x;
            Rear++;
            if (Rear == A.length) { //Start if
                Rear = 0;
            }
            c++;
        }
    }

    public static void Dequeue() {
       
        Front++;
        Front %= A.length;
        --c;
        System.out.println(Front);
    }

    public static int getFront() {
        return A[Front];
    }

    public static boolean isFull() {
       if(c==A.length)
           return true;
        return false;
    }

    public static boolean isEmpty() {
        if (c == 0) {
            return true;
        }
        return false;
    }

}
