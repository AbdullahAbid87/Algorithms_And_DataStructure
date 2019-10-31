/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postfix_and_Prefix;

import java.util.Arrays;

/**
 *
 * @author Abdullah
 */
public class Prefix_Evalution {


    static int top;
    static int[] Stack;

    public static void main(String[] args) {
        top = -1;
        String Postfix = "- + * 12 13 * 5 4 9";
        String[] A = Postfix.split("\\s");
        System.out.println(Arrays.toString(A));
        Stack = new int[Postfix.length()];
         System.out.println("Value="+Evalute(A));

    }

    public static int Evalute(String[] Exp) {
        int Result = 0;
        for (int i = Exp.length - 1; i >= 0; i--) {

            if (isOperator(Exp[i])) {
               
                int OP1 = Integer.parseInt("" + Peek());
            
                POP();
                int OP2 = Integer.parseInt("" + Peek());
                POP();
                Result = PerformOperation(OP1, OP2, Exp[i]);
               
                Push(Result);
            } else {
                     Push(Integer.parseInt(Exp[i]) );     
            }
        }

        return Result;
    }

    public static void Push(int C) {
        ++top;

        Stack[top] = C;

    }

    public static void POP() {
        if (top == -1) {
            return;
        }
        top--;

    }

    public static int Peek() {
      
        return Stack[top];
    }

    public static int PerformOperation(int OP1, int OP2, String Operator) {
     
        if (Operator.equals("/")) {
            return OP1 / OP2;
        } else if (Operator.equals("*")) {
            return OP1 * OP2;
        } else if (Operator.equals("+")) {
            return OP1 + OP2;
        } else if (Operator.equals("-")) {
            return OP1 - OP2;
        } else if (Operator.equals("^")) {
            return (int) Math.pow(OP1, OP2);
        }
        return -1;
    }

    public static boolean isOperator(String C) {
        if (C.equals("/") || C.equals("*") || C.equals("+") || C.equals("-") || C.equals("^")) {
            return true;
        }
        return false;
    }
}
