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
public class Q4 {

    public static void main(String[] args) {
        System.out.println(f(6));

    }

    public static int f(double n) {
        if (n == 1) {
            return 0;
        } else {
         return   f( Math.floor(n / 2) );
        }

    }
}
