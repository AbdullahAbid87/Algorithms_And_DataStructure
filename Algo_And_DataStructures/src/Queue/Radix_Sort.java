 package Queue;

import java.util.Arrays;

public class Radix_Sort {

    int front;
    int rear;
    int[] Array;
    Radix_Sort Q[];

    public static void main(String[] args) {
        int[] GA = {1, 8211, 5111, 12, 2111, 30};
        Radix_Sort R = new Radix_Sort();
        R.Q = new Radix_Sort[10];
        for (int i = 0; i < 10; i++) {
            R.Q[i] = new Radix_Sort();
            R.Q[i].Array = new int[10];
        }
        System.out.println("Given Array:");
        System.out.println(Arrays.toString(GA));
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(R.Radix_Sort(GA)));
    }

    public int[] Radix_Sort(int A[]) {

        int n = A.length;
        int m, d = 0, k = 0, j, div = 1, l, q = 1;
        m = Max(A);
    
        while (m > 0) {
            m /= 10;
            ++k;
        }

        for (int i = 0; i < k; i++) {

            for (j = 0; j < n; j++) {
                q = A[j];
                q /= div;
                d = q % 10;
                Q[d].Enqueue(A[j]);

            }

            j = 0;
            for (l = 0; l < Q.length; l++) {

                while (!Q[l].isEmpty()) {
                    A[j] = Q[l].getfront();

                    Q[l].Dequeue();
                    ++j;
                }
            }

            div *= 10;
        }
        return A;
    }

    public int getfront() {
        return Array[front];
    }

    public void Enqueue(int x) {

        Array[rear] = x;
        rear++;
    }

    public void Dequeue() {

        front++;

    }

    public static int Max(int A[]) {
        int max = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        return max;
    }

    public boolean isEmpty() {
        if (front == rear) {
            return true;
        }
        return false;
    }

    public void Empty() {
        while (front != rear) {
            ++front;

        }

    }
}
