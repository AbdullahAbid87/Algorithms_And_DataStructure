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
public class BinarySearch {
    static int A[]={2,4,6,8,10,12,14,16,18,20};
    public static void main(String[] args){
   
    int SearchKey=4;
 if(Binary_Search(SearchKey)!=-1){
    System.out.println("Search Found on Index Number="+Binary_Search(SearchKey));     
 }else{
 System.out.println("Search Not Found");
 }
    }

    public static int Binary_Search(int SearchKey) {
        int Start=0;
        int End=A.length-1;
        while(Start<=End){
            int m=(Start+End)/2;
                    if(A[m]==SearchKey){
                            return m;
                    }
                    else if(SearchKey<A[m]){
                            End=m-1;
                    }
                    else{
                            Start=m+1;
                    }
                    
        }
        return -1;
    }   
    
    
}
