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
public class BubbleSort_Ascending {
     public static void main(String[] args){
         int temp;
        int A[]={45,52,23,74,12,86,14,26,71};
        
        //Outer Loop
        for(int i=0;i<A.length;i++){
            //Inner Loop
                for(int j=0;j<A.length-i-1;j++){
                    if(A[j]>A[j+1]){
                        temp=A[j];
                        A[j]=A[j+1];
                        A[j+1]=temp;
                     //    System.out.println(Arrays.toString(A));
                    }//End If
      
                }
                     System.out.println(Arrays.toString(A));
        }
        
    
                       //  System.out.println(Arrays.toString(A));
        
     }
}
