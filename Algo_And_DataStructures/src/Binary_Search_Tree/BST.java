/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary_Search_Tree;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author Abdullah
 */
public class BST {

    private Node root;

    BST() {
        root = null;
    }

    public void Insert(int n) {
        Node a = new Node();
        a.data = n;
        if (root == null) {
            root = a;
        } else {
            Node p = root;
            Node x = root;
            while (x != null) {
                p = x;
                if (n < x.data) {
                    x = x.left_child;
                } else {
                    x = x.Right_child;
                }
            }
            if (n < p.data) {
                p.left_child = a;
            } else {
                p.Right_child = a;
            }

        }

    }

    public void INORDER() {
        inorder(root);
    }

    public void inorder(Node P) {
        if (P == null) {
            return;
        } else {
            inorder(P.left_child);
            System.out.print(P.data + ",");
            inorder(P.Right_child);
        }

    }

    public void PREORDER() {
        inorder(root);
    }

    public void preorder(Node P) {
        if (P == null) {
            return;
        } else {
            System.out.print(P.data + ",");
            inorder(P.left_child);
            inorder(P.Right_child);
        }

    }

    public void POSTORDER() {
        inorder(root);
    }

    public void postorder(Node P) {
        if (P == null) {
            return;
        } else {
            inorder(P.left_child);
            inorder(P.Right_child);
            System.out.print(P.data + ",");
        }

    }

    public void Levlwise() {
        Node P = root;
        Queue<Node> Q = new LinkedList<Node>();
        Q.add(P);
        while (!Q.isEmpty()) {
            P = Q.remove();
            System.out.print(P.data + ",");
            if (P.Right_child != null) {
                Q.add(P.left_child);
            }
            if (P.Right_child != null) {
                Q.add(P.Right_child);
            }
        }

    }

    private void remove(int v, Node R) {
        int ch;
        Node D = root;
        Node P = root;

        while (D != null && D.data != v) {
            P = D;
            if (v < D.data) {
                D = D.left_child;
            } else {
                D = D.Right_child;
            }
        }
        if (D == null) {
            return;
        }
        ch = NoOfChild(D);
        if (ch == 0) {
            if (P.left_child == D) {
                P.left_child = null;
            } else {
                P.Right_child = null;
            }

        } else if (ch == 1) {
            if (P.left_child == D) {
                if (D.left_child != null) {
                    P.left_child = D.Right_child;
                } else {
                    P.left_child = D.Right_child;
                }
            } else {
                if (D.left_child != null) {
                    P.Right_child = D.left_child;
                } else {
                    P.Right_child = D.Right_child;
                }
            }

        } else if (ch == 2) {
            Node S, T;
            S = T = D;
            S = D.Right_child;
            while (S.Right_child != null) {
                T = S;
                S = S.left_child;

            }
            D.data = S.data;
            remove(S.data, S);

        }

    }

    public int NoOfChild(Node x) {
        int c = 0;
        if (x.left_child == null) {
            c++;
        }
        if (x.Right_child == null) {
            c++;
        }
        return c;
    }
    
    void Stack_inorder() {
        if (root == null) {
            return;
        }
        
        //keep the nodes in the path that are waiting to be visited
        Stack<Node> stack = new Stack<Node>();
        Node node = root;
         
        //first node to be visited will be the left one
        while (node != null) {
            stack.push(node);
            node = node.left_child;
        }
         
        // traverse the tree
        while (stack.size() > 0) {
           
            // visit the top node
            node = stack.pop();
            System.out.print(node.data + " ");
            if (node.Right_child!= null) {
                node = node.Right_child;
                 
                // the next node to be visited is the leftmost
                while (node != null) {
                    stack.push(node);
                    node = node.Right_child;
                }
            }
        }
    }

    public static void main(String[] args) {
        BST bst = new BST();
        bst.Insert(40);
        bst.Insert(30);
        bst.Insert(60);
        bst.Insert(20);
        bst.Insert(10);
        bst.Insert(25);
        bst.Insert(65);
        bst.Insert(80);
        bst.Insert(70);
        bst.Insert(62);
        bst.Insert(55);
        bst.Insert(90);

        System.out.println("INORDER:");
        bst.INORDER();
       // bst.Stack_inorder();
        System.out.println("\n POSTORDER:");
        bst.POSTORDER();
      //  System.out.println("\n LEVEL WISE:");
     //   bst.Levlwise();
        System.out.println("\n PREORDER:");
        bst.PREORDER();

    }

    private void remove(int data) {
        remove(data, root);
    }

}
