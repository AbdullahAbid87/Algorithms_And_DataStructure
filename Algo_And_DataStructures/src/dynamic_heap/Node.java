/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamic_heap;

/**
 *
 * @author Abdullah
 */
public class Node {
    int data;
    int index;
    public Node parent;
    public Node leftchild;
    public Node rightchild;
    
    public Node() {
        data=0;
        parent=null;
        leftchild=null;
        rightchild=null;
    }
    
}
