/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyString;

import java.util.Arrays;

/**
 *
 * @author Abdullah
 */
public class MyString {

    char[] A;
    char[] C;

    public static void main(String[] args) {
        MyString Str = new MyString();

        String string1 = "COMSATS";
        String string2 = "ISLAMABAD";
        Str.A = string1.toCharArray();
        Str.C = string2.toCharArray();
        char[] B = Str.SubString(2, 3);
        System.out.println("SubString:");
        System.out.println(Arrays.toString(B));
        System.out.println("Index Of:");
        System.out.println(Str.indexof('C'));
        System.out.println("Concat:");
        System.out.println(Arrays.toString(Str.concat(Str.C)));
        System.out.println("Length of A:");
        System.out.println(Str.length());
    }

    public int length() {
        int i = 0;

        try {
            while (A[i] != '\0') {
                i++;
            }

        } catch (Exception e) {
        }

        return i;
    }

    public char[] SubString(int P, int n) {
        char[] X = new char[n];
        int i;

        for (i = 0; i < n; i++) {

            X[i] = A[P + i];

        }

        return X;
    }

    public int indexof(char c) {
        int i;
        for (i = 0; i < A.length; i++) {
            if (A[i] == c) {
                return i;
            }
        }
        return -1;
    }

    public char[] concat(char[] C) {

        char[] X = new char[A.length + C.length];
        int i = A.length;
        int j = 0;
        for (j = 0; j < A.length; j++) {
            X[j] = A[j];
        }

        for (i = A.length, j = 0; i < X.length && j < C.length; i++, j++) {
            X[i] = C[j];

        }

        return X;
    }
}
