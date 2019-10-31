/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorts;

import LinkList.Double_Circular.LinkedList;
import java.util.Arrays;

/**
 *
 * @author Abdullah
 */



public class QuickSort {

    public static void main(String[] args) {
        int a[]={25,45,35,85,65,40,20,30,90,50};
        quicksort1(a,0,a.length-1);
        for(int A:a)
            System.out.println(A+",");
    }
    public static void quicksort1(int arr[],int low,int high){
        int pi=0;//partition element
        
        
        if(low<high){
   System.out.println("A["+low+", "+high+"]");  
            pi=partition(arr,low,high);
            
            quicksort1(arr, low, pi-1);//before pi
            quicksort1(arr, pi+1, high);//after pi
     
        }
    }                                                                                                                                                                                                                                                                                                                                                                                                       
    public static int partition(int arr[],int low,int high){
      
        int pivot=arr[high];
        int j,i=(low-1);//index of smaller element
        for(j=low;j<high;j++){
            //if current element is smaller than or equal to pivot
            if(arr[j]<=pivot){
                i++;//increment index of smaller element
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        System.out.println(Arrays.toString(arr));
               return(i+1);
    }
    private static void swap(int a[],int i,int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
 
}
