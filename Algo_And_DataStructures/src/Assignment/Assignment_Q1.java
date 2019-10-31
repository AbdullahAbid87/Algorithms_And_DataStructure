package Assignment;


import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdullah
 */


/*
Q1:Write a Function that takes two Integer Arrays and Merge them into a Single Array.
The Contents of Both Input Array are in-order(Ascending) and after the Merger the result 
should be in order
Let A={1,3,4,6} and B={2,5,9} then result should be {1,2,3,4,5,6,9}

*/


public class Assignment_Q1 {
    
  public static void main(String[] args){
                int A[]={1,3,4,6};
                int B[]={2,5,9};
            int [] MergedArray= Merge(A,B);
            System.out.println(Arrays.toString(MergedArray));
  }
  public static int[] Merge(int[] A,int[] B){
            int AL=A.length;
            int BL=B.length;
            int i=0,j=0,k=0;
            int MA[]=new int[AL+BL];
      //First While
      while(i<AL && j<BL){
                if(A[i]<=B[j]){
                        MA[k]=A[i];
                        ++i;
                }
                    else{
                            MA[k]=B[j];
                            ++j;
                    }
          ++k;
      }
      //Second While
      while(i<AL){
                MA[k]=A[i];
                ++i;
                ++k;
      }
      //Third While
      while(j<BL){
                MA[k]=B[j];
                ++j;
                ++k;
      }
      return MA;
  } 
  
}
