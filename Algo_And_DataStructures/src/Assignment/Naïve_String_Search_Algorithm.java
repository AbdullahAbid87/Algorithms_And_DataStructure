package Assignment;


/**
 *
 * @author Abdullah
 */

/*

/*
Q2:Write a Function that uses the Following Algorithms,to Match a given pattern P in a text T,and return the index of first occurrence of P in T e.g
a)Naïve String Search Algorithm
b)Rabin-Karp String Search Algorithm
c)Knuth-Morris-Pratt Algorithm
d)Boyer Moore String Search Algorithm
*/

// a)
public class Naïve_String_Search_Algorithm {
        
        public static void main(String[] args){
            char[] T={'C','O','M','S','A','T','S',
                'I','S','L','A','M','A','B','A','D'};
      
            char[] P={'I','S','L','A','M'};  
            if(Naive_String_Search(T,P)!=-1)
                    System.out.println("Word found at index ="+Naive_String_Search(T,P) );
            else
                    System.out.println("Word not Found");
        }//End Main
        
        public static int Naive_String_Search(char[] T,char[] P){
            int i,j;
            int n=T.length;
            int m=P.length;
         for(i=0;i<n-m;i++){ //Start Outer Loop
                for(j=0;j<m;j++){ //Start Inner Loop
                        if(T[i+j]!=P[j]){ //Start IF
                        break;
                } //End IF
             }//End Inner Loop
                
             if(j==m){ //Start IF
                 return i;
             } //End IF 
                 
             }//End Outer Loop
         return -1;
         } //End Method   
            
        }//End Class
