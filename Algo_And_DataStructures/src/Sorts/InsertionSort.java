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
public class InsertionSort {
    public static void main(String[] args){
    int A[]={7,2,4,1,5,3};
    int hole;
    int Value;
    for(int i=1;i<A.length;i++){
             hole=i;
             Value=A[hole];
           while(hole>0 && A[hole-1]>Value){
               A[hole]=A[hole-1];
               --hole;
           }
           A[hole]=Value;
        
        }
    System.out.println(Arrays.toString(A));
    }
    
    } 
    

