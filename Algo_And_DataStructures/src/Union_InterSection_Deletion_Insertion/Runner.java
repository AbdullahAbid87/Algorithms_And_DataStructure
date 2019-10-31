/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Union_InterSection_Deletion_Insertion;

import java.util.Arrays;

/**
 *
 * @author Abdullah
 */
public class Runner {
    public static void main(String[] args){
       MyArray MA=new MyArray();
       int[] A={1,2,9,8,7};
       int[] B={1,6,4,2};
    System.out.println(Arrays.toString( MA.Union(A, B)) );
    System.out.println(Arrays.toString( MA.Intersection(A, B)) );
    }
}
