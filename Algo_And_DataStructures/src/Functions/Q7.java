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
public class Q7 {
  public static void main(String[] args){
  System.out.println(gcd(4,5));
  } 
  public static int gcd(int a,int b){
      if(b==0)
          return a;
      else if(a<b)
          return gcd(b,a);
      else{
      return gcd(a-b,b);
      }
  }
}
