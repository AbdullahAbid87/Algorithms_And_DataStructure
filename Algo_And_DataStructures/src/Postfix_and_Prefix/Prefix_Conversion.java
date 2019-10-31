/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postfix_and_Prefix;

import java.util.Arrays;
import java.util.StringTokenizer;

/**
 *
 * @author Abdullah
 */
public class Prefix_Conversion {

    public static int top;
    public static char[] Stack;

    public static void main(String[] args) {
        top = -1;
        String Given_Exp = "(50+6)*85";
        Stack = new char[Given_Exp.length()];
        String Reverse_Exp = Reverse(Given_Exp);
        System.out.println("Given Expression=" + Given_Exp);
        System.out.println("Reverse Expression=" + Reverse_Exp);
        System.out.println("PreFix Value=" + Prefix(Reverse_Exp));
    }

    public static String Reverse(String Exp) {
        String temp1 = "";
        String temp2 = "";
        String temp3 = "";
        String A[];
        String B[];
        int i, j;
        StringTokenizer stk = new StringTokenizer(Exp, "/*^+-() ", true);
        while (stk.hasMoreTokens()) {
            temp1 += stk.nextToken() + ",";
        }
        temp2 = temp1.substring(0, temp1.length() - 1);
        A = temp2.split(",");
        B = new String[A.length];

        for (i = B.length - 1, j = 0; i >= 0 && j < B.length; i--, j++) {

            B[j] = A[i];
        }

        for (int k = 0; k < B.length; k++) {
            temp3 += B[k];
        }
        return temp3;
    }

    public static String Prefix(String Exp) {
        String PC[] = new String[Exp.length()];
        String temp[] = new String[PC.length];
        int p, q;
        int counter = -1;
        String Prefix_Value = "";
        StringTokenizer stk = new StringTokenizer(Exp, "/*^+-() ", true);
        while (stk.hasMoreTokens()) {
            String token = stk.nextToken();
            char c = token.charAt(0);
            if (token.length() == 1 && isOperator(c)) {

                if (!isEmpty()) {

                    while ((Precedence(c) < Precedence(Stack[top]))) {
                        ++counter;
                        PC[counter] = Peek() + "";
                        POP();
                        Push(c);
                    }
                    if (Stack[top] == ')' || Stack[top] == '}' || Stack[top] == ']') {
                        Push(c);

                    }

                } else {

                    Push(c);

                }

            } else if ((token.length() == 1 && (c == ')' || c == '}' || c == ']'))) {
                Push(c);

            } else if ((token.length() == 1 && (c == '(' || c == '{' || c == '['))) {
                while (true) {
                    if ((Stack[top] == ')' || Stack[top] == '}' || Stack[top] == ']')) {
                        break;
                    }
                    ++counter;
                    PC[counter] = Peek() + "";

                    POP();

                }
                POP();

            } else if ((token.length() == 1) && (c == ' ')) {
            } else {
                ++counter;
                PC[counter] = token;
            }

        }
        while (top > -1) {
            ++counter;
            PC[counter] = Peek() + "";

            POP();
        }

        for (p = 0, q = temp.length - 1; p < temp.length && q >= 0; q--) {
            if (PC[q] != null) {

                temp[p] = PC[q];
                ++p;
            }
        }

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == null) {
                break;
            }
            Prefix_Value += temp[i];
        }

        return Prefix_Value;
    }

    public static char Peek() {
        return Stack[top];
    }

    public static void Push(char c) {
        ++top;
        Stack[top] = c;
    }

    public static void POP() {
        --top;
    }

    public static boolean isOperator(char c) {
        if (c == '/' || c == '*' || c == '-' || c == '+' || c == '^') {
            return true;
        }
        return false;
    }

    public static int Precedence(char c) {
        if (c == '^') {
            return 3;
        } else if (c == '/' || c == '*') {
            return 2;
        } else if (c == '+' || c == '-') {
            return 1;
        }
        return -1;
    }

    public static boolean isEmpty() {
        if (top > -1) {
            return false;
        }
        return true;
    }
}
