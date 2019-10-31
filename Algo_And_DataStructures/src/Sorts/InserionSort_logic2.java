/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorts;

import java.util.Arrays;

/**
 *
 * @author Abdullah
 */
public class InserionSort_logic2 {
    public static void main(String[] args){
        int A[]={45,52,23,74,12,86,14,26,71};
        IS(A);
        //System.out.println(Arrays.toString(A));
    }
    public static void IS(int A[]){
        int n=A.length;
        int key;
        int i,j;
    for(i=1;i<n;i++){
       key=A[i];
       j=i-1;
      while(key<A[j]){
      A[j+1]=A[j];
      j--;
      if(j<0)
          break;
        }
      A[j+1]=key;
      System.out.println(Arrays.toString(A));
    }
    
    }
}
