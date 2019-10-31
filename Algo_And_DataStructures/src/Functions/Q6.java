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
public class Q6 {
public static void main(String[] args){
System.out.println(Q(6,5));
}
public static int Q(int a,int b){
    if(a<b){
    return 0;
    }
    else if(b<=a){
    return Q(a-b,b)+1;
    }
    return -1;
}
}
