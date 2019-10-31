/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Union_InterSection_Deletion_Insertion;

/**
 *
 * @author Abdullah
 */
public class Union {
   public static void main(String[]args){
    int A[]={1,3,5,7};
    int B[]={2,4,6,8,10};
    int n,m,i=0,j=0,k=0,x;
    n=A.length;
    m=B.length;
    x=n+m;
    int union[]=new int[x];
    while(i<n && j<m ){
        if(A[i]<B[j]){
            union[k]=A[i];
           k++;
            i++;}
            
        else if (A[i]>B[j]){
            union[k]=B[j];
            k++;
            j++;
            }
        else if(A[i]==B[j]){
            union[k]=A[i];
            k++;
            i++;
            j++;
           }
        }
    for(int y=0;y<x;y++){
    System.out.print(" "+union[y]);
}    
}

}
