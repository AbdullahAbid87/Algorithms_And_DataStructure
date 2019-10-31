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
public class Prefix {

    public static char[] OExp;
    public static char[] Exp;
    public static char[] Stack;
    public static int top;
    public static char[] prefix_value;
    public static String PV;
    public static String[] A;
    public static void main(String[] args) {
        top = -1;
       // String str = "a*b/(a-c)+d*b";
       String str = "11+3/4*22";
       StringTokenizer Stk=new StringTokenizer(str,"()+-/*^");
         if(Stk.hasMoreTokens()){
             
         }
        
        
        
        
        
        
        
        OExp = (str.trim()).toCharArray();
     
        Lab_Task_2 LT2 = new Lab_Task_2();
        Stack = new char[OExp.length];
        if (Lab_Task_2.isValid(OExp) == -1) {
            System.out.println("Brackets are Not Valid");
        } else {
            System.out.println("Original Array:");
            System.out.println(Arrays.toString(OExp));     
            System.out.println("Reversed Array:");
               Exp = reverse(OExp);
            System.out.println(Arrays.toString(Exp));
                   System.out.println("Prefix Array:");
         System.out.println(Arrays.toString(   prefix(reverse(Exp))));
        }
    }

    public static char[] prefix(char Expo[]) {
       
        for (int i = 0; i < Exp.length; i++) {
            if ((Exp[i] > '0' && Exp[i] < '9') || (Exp[i] >= 'a' && Exp[i] <= 'z') || (Exp[i] >= 'A' && Exp[i] <= 'Z')) {
                PV = PV + Exp[i];
        
            } else if (isOperator(Exp[i])) {
       
                while (top > -1 && Precedence(Exp[i]) < Precedence(Stack[top])) {
                    if (Stack[top] == '(' || Stack[top] == '{' || Stack[top] == '[') {
                        break;
                    }
                    PV = PV + Peek();
                    POP();
                }
   

                Push(Exp[i]);

            } else if (Exp[i] == ')' || Exp[i] == '}' || Exp[i] == ']') {
                Push(Exp[i]);

            } else if (Exp[i] == '(' || Exp[i] == '{' || Exp[i] == '[') {
             
                while (true) {
                    if (Peek() == ')' || Peek() == '}' || Peek() == ']') {
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

        String returnValue=PV.substring(4,PV.length());
        return reverse(returnValue.toCharArray() );

    }

    public static char[] reverse(char[] OExp) {
        char temp[] = new char[OExp.length];
        int i, j;
        for (i = OExp.length - 1, j = 0; i >= 0 && j <= OExp.length; i--, j++) {
           
            temp[j] = OExp[i];

        }
        return temp;
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

    public static boolean isOperator(char C) {
        if (C == '+' || C == '-' || C == '*' || C == '/' || C == '^') {
            return true;
        }
        return false;
    }
}

