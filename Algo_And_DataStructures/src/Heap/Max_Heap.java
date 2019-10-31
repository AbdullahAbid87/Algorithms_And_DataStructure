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
public class Max_Heap {

    private int[] A;
    private int n;

    public Max_Heap() {
        A = new int[10];
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
    public void insert(int v){
        A[n]=v;
        n++;
        if(n>1)
          HeapUp(n-1);
    }

    public void Delete() {
        A[0]=A[n];
        n--;
        HeapDown(0);
    }

    public void HeapDown(int x) {
        int L=2*x+1;
        int R=2*x+2;
        int C;
        if(A[L]>A[R]){
             C=L;
        }else{
            C=R;
        }
        if(A[x]<A[C]){
            int T=A[x];
            A[x]=A[C];
            A[C]=T;
        HeapDown(C);
        }
      
    }
 public static void main(String[] fatty){
     Max_Heap ex=new Max_Heap();
     ex.insert(89);
     ex.insert(25);
     ex.insert(8);
     ex.insert(90);
     ex.Display();
     ex.Delete();
     ex.Display();
 }
   public void Display(){
   System.out.println(Arrays.toString(A));
   }
}
