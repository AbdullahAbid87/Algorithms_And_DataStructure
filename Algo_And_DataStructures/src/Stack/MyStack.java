/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import java.util.Arrays;

/**
 *
 * @author Abdullah
 */
public class MyStack {
        private static char[] A;
        private int temp;
        static  int top;
            //MyStack
        public MyStack(){
        A=new char[2];
        top=-1;
        
        }
        
    public static void main(String[] args){
        MyStack MS=new MyStack(); 
        MS.POP();
       
        MS.Push('A');
            System.out.println(A[0]);
        MS.Push('B');
        System.out.println(A[1]);
        MS.Push('C');
        System.out.println(A[2]);
    
    }
    public  void Push(char C){
            ++top;
            if(top==A.length){
                return;
            }
            A[top]=C;
                       
    }
    
    public  void POP(){
        if(top==-1){
            return;
                    }
        top--;
      
       
    }
    
    public static char Peek(){
        return A[top];
    }

}
