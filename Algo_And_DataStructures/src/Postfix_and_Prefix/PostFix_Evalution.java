package Postfix_and_Prefix;


import java.util.Arrays;

public class PostFix_Evalution{
   static char[] A;
    static int top;
    static int[] Stack;
    public static void main(String[] args){
        top=-1;
        String Postfix="232/26+*+7-";
        A=Postfix.toCharArray();
       Stack=new int[Postfix.length()]; 
       System.out.println("Expression:"+Postfix);
      System.out.println("Value="+Evalute());
       
       
    
    }
    public static int Evalute(){
        int Result = 0;
        for(int i=0;i<A.length;i++){
            
            if(A[i]>='0' && A[i]<='9'){
                Push(A[i]-48);
            }else{
               
              
               int OP1=Integer.parseInt(""+Peek());
    
                POP();
                int OP2=Integer.parseInt(""+Peek());
                POP();
            Result=     PerformOperation(OP1,OP2,A[i]);
      
          Push(Result);
            }
        }
        
        return Result;
    } public static void Push(int C){
            ++top;
           
            Stack[top]=C;
             
    }
    
    public static void POP(){
        if(top==-1){
            return;
                    }
        top--;
      
       
    }
    
    public static int Peek(){
     
        return Stack[top];
    }
    public static int PerformOperation(int OP1,int OP2,char Operator){

        if(Operator=='/'){
                return OP2/OP1;
            }else if(Operator=='*'){
                return OP2*OP1;
            }else if(Operator=='+'){
                return OP2+OP1;
            }else if(Operator=='-'){
                return OP2-OP1;
            }else if(Operator=='^'){
                 return (int) Math.pow(OP2, OP1);
            }
    return -1;
    }

}