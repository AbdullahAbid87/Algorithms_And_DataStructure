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
public class PostFix {

    static char[] Exp;
    static char[] Postfix_Value;
    static char[] Stack;
    static int top;
    static String PV;

    public static void main(String[] args) {
        Lab_Task_2 LT2 = new Lab_Task_2();
        top = -1;
      //  String str = "(-b+(b^2-4(a*c))^1/2)/2a";
       String str = "(11+3)/(4*22)";  
      Stack = new char[str.length()];
        Exp = str.toCharArray();
        Postfix_Value = new char[str.length()];
        if (Lab_Task_2.isValid(Exp) != -1) {
            System.out.println("Expression:");
            System.out.println(Arrays.toString(Exp));
            System.out.println("Post Value:");
            System.out.println(Arrays.toString(CPFV()));
        } else {
            System.out.println("InValid Brackets");
        }
    }

    public static char[] CPFV() {
        for (int i = 0; i < Exp.length; i++) {
            if ((Exp[i] > '0' && Exp[i] < '9') || (Exp[i] >= 'a' && Exp[i] <= 'z') || (Exp[i] >= 'A' && Exp[i] <= 'Z')) {
                PV = PV + Exp[i];
             
            } else if (isOperator(Exp[i])) {
                
                while (top > -1 && Precedence(Exp[i]) <= Precedence(Stack[top])) {
                    if (Stack[top] == '(' || Stack[top] == '{' || Stack[top] == '[') {
                        break;
                    }
                    PV = PV + Peek();
                    POP();
                }
                

                Push(Exp[i]);

            } else if (Exp[i] == '(' || Exp[i] == '{' || Exp[i] == '[') {
                Push(Exp[i]);

            } else if (Exp[i] == ')' || Exp[i] == '}' || Exp[i] == ']') {
               
                while (true) {
                    if (Peek() == '(' || Peek() == '{' || Peek() == '[') {
                        break;
                    }

                    PV += Peek();
                    POP();
                }
                POP();
            }
        }
        while (top > -1) {
            PV = PV + Peek();
            POP();
        }
        String ReturnValue=PV.substring(4, PV.length());
        return ReturnValue.toCharArray();
    }

    public static void Push(char C) {
        ++top;
        Stack[top] = C;
    }

    public static void POP() {
        --top;
    }

    public static char Peek() {
        return Stack[top];
    }

    public static boolean isOperator(char C) {
        if (C == '+' || C == '-' || C == '*' || C == '/' || C == '^') {
            return true;
        }
        return false;
    }

    

    public static int Precedence(char C) {
        if (C == '^') {
            return 3;
        } else if (C == '*' || C == '/') {
            return 2;
        } else if (C == '+' || C == '-') {
            return 1;
        }
        return -1;
    }
}
