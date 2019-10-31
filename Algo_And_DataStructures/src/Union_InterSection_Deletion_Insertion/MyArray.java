/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Union_InterSection_Deletion_Insertion;

/**
 * @author Abdullah
 */
public class MyArray {

    int[] Union_Array;
    int[] InterSection_Array;

    public int[] Union(int A[], int B[]) {
        Union_Array = new int[A.length + B.length];
        int counter = 0;
        for (int i = 0; i < A.length; i++) {
            if (!Exists(A[i], Union_Array)) {
                Union_Array[counter] = A[i];
                counter++;
            }
        }
        int j, l;
        for (j = A.length, l = 0; j < Union_Array.length && l < B.length; j++, l++) {
            if (!Exists(B[l], Union_Array)) {

                Union_Array[counter] = B[l];
                counter++;
            }

        }
        int X[] = new int[counter];
        for (int Q = 0; Q < counter; Q++) {
            X[Q] = Union_Array[Q];
        }
        return X;
    }

    public int[] Intersection(int A[], int B[]) {
        InterSection_Array = new int[A.length + B.length];
        int counter = 0;
        for (int i = 0; i < A.length; i++) {
            if (!Exists(A[i], InterSection_Array)) {
                for (int j = 0; j < B.length; j++) {
                    if (A[i] == B[j]) {
                        InterSection_Array[counter] = B[j];
                        counter++;
                    }
                }
            }
        }
      int X[] = new int[counter];
        for (int Q = 0; Q < counter; Q++) {
            X[Q] = InterSection_Array[Q];
        }
        return X;
    }

    public boolean Exists(int A, int[] X) {

        for (int i = 0; i < X.length; i++) {

            if (A == X[i]) {

                return true;
            }
        }

        return false;
    }

}
