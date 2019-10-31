package Assignment;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdullah
 */
public class Rabin_Karp_String_Search_Algorithm {
    char[] T;
    //Constructor
    public Rabin_Karp_String_Search_Algorithm(char B[]){
            T=new char[B.length];
            for(int i=0;i<B.length;i++)
                    T[i]=B[i];
    }
    
    //Main Method
    public static void main(String[] args){
     
    
        char[] Array={'C','O','M','S','A','T','S'
        ,'I','S','L','A','M','A','B','A','D' };
        char[] P={'I','S','L','A','M'};   
           Rabin_Karp_String_Search_Algorithm Q2=new Rabin_Karp_String_Search_Algorithm(Array);
           
     
    System.out.println( "Index found at="+   Q2.RKSearch(Array, P)  );
       
    }
    public int RKSearch(char[] T,char[] P){
            int HP,HT;
            char S[];
            int n=T.length;
            int m=P.length;
            HP=hash(P);
        for(int i=0;i<n-m;i++){
                S=SubString(i,m);
                HT=hash(S);
                if(HT==HP)
                      return i;
        }
        return -1;
    }
    //Hash Method
    public  int hash(char A[]) {
        int hash = 0;
   for (int i = 0; i < A.length; i++)
            hash = (hash * 31) + A[i];
            return hash;
    }
    //SubString Method 
public  char[] SubString(int P,int n ){
        char X[]=new char[n];
        for(int i=0;i<n;i++){
                X[i]=T[P+i];
        }
    return X;
}
    
}
