/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo_and_datastructures.BinarySearch;

/**
 *
 * @author Abdullah
 */
public class LinearSearch {
    public static void main(String[] args){
           int A[]={4,7,8,9,11};
         int key=4;
         
         
         System.out.println("The Value is found at Index="+LS(key,A));
         
           
    }
          public static int LS(int key,int A[]){
               
              for(int i=0;i<A.length;++i){
                      if(key==A[i]){
                            return i;
                      }  
                
                }
                    return -1;
          } 
           
    }

