/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quick_Sort_Doubly_LinkedList;

import LinkList.Double_Circular.LinkedList;
import LinkList.Double_Circular.Node;

/**
 *
 * @author Abdullah
 */
public class QuickSort {

   

    public void QS(LinkedList List) {
        List.Head.Prev = null;
        List.Tail.next = null;
        QuickSort(List.Head, List.Tail);
        List.Head.Prev = List.Tail;
        List.Tail.next = List.Head;

    }

    private void QuickSort(Node Low, Node High) {

        if (High != null && Low != High && Low != High.next) {
      
            Node pi = partition(Low, High);
            QuickSort(Low, pi.Prev);
            QuickSort(pi.next, High);

        }

    }

    public Node partition(Node Low, Node High) {

        Node j, i = Low;
        try {
            int Pivot = High.data;

            for (j = Low; j != High; j = j.next) {
                if (j.data <= Pivot) {
                    swap(j, i);
                    i = i.next;
                }

            }
            swap(i, High);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }

    public void swap(Node N1, Node N2) {

        int temp = N1.data;
        N1.data = N2.data;
        N2.data = temp;

    }

  
}
