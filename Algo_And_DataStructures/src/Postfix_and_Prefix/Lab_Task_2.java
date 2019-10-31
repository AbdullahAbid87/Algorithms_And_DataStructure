/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postfix_and_Prefix;

import java.util.Arrays;
//


/**
 *
 * @author Abdullah
 */
public class Lab_Task_2 {

    static char[] C;
    static char[] Stack;
    static int top;
    //  static int topS;
    public Lab_Task_2(){
    
    
    }
    
    public static void main(String[] args) {
     

        String S = "2+3/2*(2+6)-7";
        C = new char[S.length()];
      
        C = S.toCharArray();

        if (isValid(C) == -1) {
            System.out.println("InValid Brackets");
        } else {
            System.out.println("Valid Brackets");
        }
        System.out.println(Arrays.toString(C));
    }

    public static int isValid(char[] A) {
          top = -1;
          Stack = new char[A.length];
        for (int i = 0; i < A.length; i++) {

            if (A[i] == '{' || A[i] == '(' || A[i] == '[') {
                if (!(PriorityCheck(A[i]))) {
                    return -1;
                }
                Push(A[i]);

            } else if (A[i] == '}') {
                if (top == -1) {
                    return -1;
                }
                if (Stack[top] != '{') {
                    return -1;

                }
                POP();
            } else if (A[i] == '[') {
                if (top == -1) {
                    return -1;
                }
                if (Stack[top] != ']') {
                     return -1;
                }
                POP();
            } else if (A[i] == ')') {
                if (top == -1) {
                    return -1;
                }
                if (Stack[top] != '(') {
                     return -1;
                }

                POP();
            }

        }
        if (top == -1) {
            return 2;
        }
        return -1;
    }

    public static void Push(char c) {
        ++top;
        Stack[top] = c;
    }

    public static void POP() {
        --top;
    }

    public static char Peek() {
        return Stack[top];
    }

    public static boolean PriorityCheck(char A) {
        if (A == '[') {
            for (int i = 0; i < top; i++) {
                if (Stack[i] == '(' || Stack[i] == '{') {
                    return false;
                }
            }
        } else if (A == '{') {
            for (int i = 0; i < top; i++) {
                if (Stack[i] == '(') {
                    return false;
                }
            }

        }
        return true;
    }

}
