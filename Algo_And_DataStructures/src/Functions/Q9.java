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
public class Q9 {

    public static void main(String[] args) {
        System.out.println(h(8));
    }

    public static int h(int n) {
        if (n < 5) {
            return 3 * n;
        } else {
            return 2 * h(n - 5) + 7;
        }
    }
}
