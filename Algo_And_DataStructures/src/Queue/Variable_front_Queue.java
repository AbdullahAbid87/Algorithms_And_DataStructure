/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

import static Queue.Circular_Queue.A;
import static Queue.Circular_Queue.Front;
import static Queue.Circular_Queue.Rear;
import java.util.Arrays;

/**
 *
 * @author Abdullah
 */
public class Variable_front_Queue {
    public static int Front;
    public static int Rear;
    public static int A[];
    
           
    public static void main(String[] args){
        Front=0;
        Rear=0;
        A=new int[8];
        
        Enqueue(1);
        System.out.println(Arrays.toString(A));
        Enqueue(2);
        System.out.println(Arrays.toString(A));
        Enqueue(3);
        System.out.println(Arrays.toString(A));
        Dequeue();
          System.out.print("After Deque=");
        for(int i=Front;i<Rear;i++)
        System.out.print(A[i]+",");
        
        
    }
    public static void Enqueue(int X){
            A[Rear]=X;
            Rear++;
    }
    public static void Dequeue(){
            Front++;
    }
    public static int getfront(){
        return A[0];
    }
}
