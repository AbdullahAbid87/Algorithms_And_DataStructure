/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkList.Single_Circular;

/**
 *
 * @author Abdullah
 */
public class LinkedList {

    public Node Head;
    public Node Tail;

    public LinkedList() {
        this.Head = null;
        this.Tail = null;

    }

    public void AddatStart(int Value) {
        Node StartNode = new Node();
        if (Head == null && Tail == null) {
            StartNode.data = Value;
            Head = StartNode;
            Tail = StartNode;

        } else {
            StartNode.data = Value;
            StartNode.next = Head;
            Head = StartNode;
            Tail.next = Head;
        }

    }

    public void AddatEnd(int Value) {
        Node EndNode = new Node();
        if (Head == null && Tail == null) {
            EndNode.data = Value;
            Tail = EndNode;
            Head = EndNode;
        } else {
            EndNode.data = Value;
            Tail.next = EndNode;
            Tail = EndNode;
            Tail.next = Head;
        }
    }

    public void Display() {
        Node P = Head;
        do {
            System.out.print(P.data + "  ");
            P = P.next;

        } while (P != Head);

    }

    public void Delete(int Deleted_Value) {
        Node P, D, P1, D1;
        P = D = Head;
        P1 = D1 = Head;
        if (Head.data == Deleted_Value) {
            Head = Head.next;
            Tail.next = Head;
            return;
        }
        if (Tail.data == Deleted_Value) {

            do {
                P1 = D1;
                D1 = D1.next;
                if (D1 == Tail) {
                    Tail = P1;
                    Tail.next = Head;
                }
            } while (D1 != Head);

            return;
        }
        do {
            P = D;
            D = D.next;
            if (D.data == Deleted_Value) {
                P.next = D.next;
                return;
            }
        } while (D != Head);
    }
}
