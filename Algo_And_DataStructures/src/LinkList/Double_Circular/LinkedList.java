/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkList.Double_Circular;

/**
 *
 * @author Abdullah
 */
public class LinkedList {

    public Node Head;
    public Node Tail;

    public LinkedList() {
        Head = null;
        Tail = null;
    }

    public void AddatStart(int Value) {
        Node StartNode = new Node();
        if (Head == null && Tail == null) {
            StartNode.data = Value;
            Head = StartNode;
            Tail = StartNode;
            Tail.next = Head;
            Tail.Prev = Head;
            Head.next = Tail;
            Head.Prev = Tail;

        } else {
            StartNode.data = Value;
            StartNode.next = Head;
            StartNode.Prev = Tail;
            Head = StartNode;
            Tail.next = Head;

        }

    }

    public void AddatEnd(int Value) {
        Node EndNode = new Node();
        if (Head == null && Tail == null) {
            EndNode.data = Value;
            Head = EndNode;
            Tail = EndNode;
            Tail.next = Head;
            Tail.Prev = Head;
            Head.next = Tail;
            Head.Prev = Tail;
        } else {
            EndNode.data = Value;
            EndNode.Prev = Tail;
            EndNode.next = Head;
            Tail.next = EndNode;
            Tail = EndNode;
            Head.Prev = EndNode;
        }

    }

    public void Display() {
        Node P = Head;

        do {

            System.out.print(P.data + " ");
            P = P.next;

        } while (P != Head);

    }

    public void Delete(int Deleted_Value) {
        Node P, D;
        P = D = Head;
        if (Head.data == Deleted_Value) {
            Head = Head.next;
            Head.Prev = Tail;
            Tail.next = Head;
            return;
        }
        if (Tail.data == Deleted_Value) {
            Tail = Tail.Prev;
            Tail.next = Head;
            Head.Prev = Tail;
            return;
        }
        do {
            P = D;
            D = D.next;
            if (D.data == Deleted_Value) {
                P.next = D.next;
                (D.next).Prev = P;
                return;
            }
        } while (D != Head);
    }

    public void ReverseDisplay() {
        Reverse(Head);

    }

    private void Reverse(Node X) {
        if (X.next != Head) {
            Reverse(X.next);
        }

    }

    public void QS(LinkedList List) {
        List.Head.Prev = null;
        List.Tail.next = null;
        QuickSort(List.Head, List.Tail);
        List.Head.Prev = Tail;
        List.Tail.next = Head;

    }

    public void QuickSort(Node Low, Node High) {

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

}//End Class
