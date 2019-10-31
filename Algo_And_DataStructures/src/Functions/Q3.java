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
public class Q3 {
  public static void main(String[] args){
      System.out.println(f(3,4));
  }  
  public static int f(int m,int n){
      if( (m==0) || (m>=n && n>=1) )
          return 1;
      else 
          return f(m-1,n)+f(m-1,n-1);
  }
  
}
