/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oredered_LinkedList;

/**
 *
 * @author Abdullah
 */
public class LinkedList {
    public Node Head;
    public Node Tail;
    
    public LinkedList(){
            Head=null;
            Tail=null;
    
    }
    public void Insert(int Value){
        Node EndNode=new Node();
        EndNode.data=Value;
        boolean Found=false;
        if(Head==null && Tail==null){
           Head=EndNode;
           Tail=EndNode;
           Tail.next=null;
       } 
        
   
        for(Node P=Head;P!=null;P=P.next){
            if(Head==null){
                Head=EndNode;
                Tail=EndNode;
                Tail.next=null;
            }else if(Value<Head.data){
                EndNode.next=Head;
                Head=EndNode;
            
            }
            
            else if(Value>Tail.data){
                    Tail.next=EndNode;
                    Tail=EndNode;
                    Tail.next=null;
            }
            
        }
        
        //   Tail.next=EndNode;
          //  Tail=EndNode;
    }
       public void Display() {
        Node P = Head;
        while (P != null) {
            System.out.print(P.data + "  ,   ");
            P = P.next;
        }
    }
      
     public void Swap(Node N1,Node N2){
          int temp=N1.data;
          N1.data=N2.data;
          N2.data=temp;
          
       }
     public int Count(){
       //  Node P=this.Head;
       int Counter=0;
         for(Node P=this.Head;P!=null;P=P.next){
             ++Counter;
         
         }
         return Counter;
     }  
}
