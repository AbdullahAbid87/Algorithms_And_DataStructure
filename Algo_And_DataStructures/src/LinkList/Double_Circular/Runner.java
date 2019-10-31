/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkList.Double_Circular;

import Quick_Sort_Doubly_LinkedList.QuickSort;

/**
 *
 * @author Abdullah
 */
public class Runner {

    public static void main(String[] args) {
        LinkedList List = new LinkedList();
        QuickSort Q=new QuickSort();
     
        List.AddatEnd(7);
        List.AddatEnd(2);
        List.AddatEnd(11);
        List.AddatEnd(6);
        List.AddatEnd(8);
        List.AddatEnd(5);
        List.AddatEnd(3);
        List.AddatEnd(4); 
        List.Display();
        Q.QS(List);
        System.out.println("\n After QuickSort:");
      List.Display();
      
    }
}
