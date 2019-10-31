/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functions;

/**
 *
 * @author Abdullah
 */
public class Q10 {

    public static void main(String[] args) {
        String S="Abdullh";
        
       System.out.println(rev(S,7 ));

    }

    public static String rev(String S, int n) {
        System.out.println("S in rev="+S);
        if (n == 1) {
            return S;
        } else {
            return (substring(S,n,1)+  rev(substring(S,1, n - 1), n - 1) );
        }


    }
    

   
    public static String substring(String S,int L,int U){
       String A="";
        for(int i=L;i<=U;i++){
    
           A+=S.charAt(i);
           

           
       }

    return A;
    }
    
}
