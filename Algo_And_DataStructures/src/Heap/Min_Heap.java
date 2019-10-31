/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heap;

import java.util.Arrays;

/**
 *
 * @author Abdullah
 */
public class Min_Heap {

    private int A[];
    private int n;

    public Min_Heap() {
        A = new int[13];
        n = 0;
    }

    public void HeapUp(int x) {
        int p;
        if (x == 0) {
            return;
        }
        if (x % 2 == 0) {
            p = (x - 2) / 2;
        } else {
            p = (x - 1) / 2;
        }

        if (A[x] > A[p]) {
            int T = A[x];
            A[x] = A[p];
            A[p] = T;
            HeapUp(p);

        }

    }

    public void HeapDown(int x) {
        int L = 2 * x + 1;
        int R = 2 * x + 2;
        int P;
        if (A[L] > A[R]) {
            P = L;
        } else {
            P = R;
        }
        if (A[x] < A[P]) {
            int T = A[x];
            A[x] = A[P];
            A[P] = T;
            HeapDown(P);
        }

    }

    public void insert(int v) {
        A[n] = v;
        n++;
        if (n > 1) {
            HeapDown(n - 1);
        }
    }

    public static void main(String[] args) {
        Min_Heap MH = new Min_Heap();
        MH.insert(50);
        MH.insert(40);
        MH.insert(60);
        MH.insert(80);
        MH.insert(20);
        MH.insert(90);
        MH.insert(70);
        MH.insert(35);
        MH.insert(25);
        MH.insert(75);
        MH.insert(95);
        MH.insert(85);
        MH.insert(45);
System.out.println(Arrays.toString(MH.A));
    }
}
