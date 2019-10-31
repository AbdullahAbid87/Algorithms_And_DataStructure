/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functions;

/**
 *
 * @author Abdullah
 */
public class Q5 {
   public static void main(String[] args){
   System.out.println(f(8));
   } 
   public static int f(int n){
       if(n==0){
       return 1;
       }else if(n==1){
       return 2;
       }else if(n>=2){
       return 2*f(n-1);
       }else {
       return -1;
       }
       
   }
}
