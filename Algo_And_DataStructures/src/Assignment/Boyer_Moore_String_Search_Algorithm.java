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
public class Boyer_Moore_String_Search_Algorithm {
    public static void main(String[] args){
        char[] T={'C','O','M','S','A','T','S',
        'I','S','L','A','M','A','B','A','D'
        };
        char[] P={'I','S','L','A','M'};

        if(BMSearch(T,P)!=-1){
        System.out.println("Word Found at Index="+BMSearch(T,P));
                
        }else{
         System.out.println("Word Not Found");
        }
    
    }
    public static int BMSearch(char[] T,char[] P){
      
        int i=P.length-1,j=P.length-1,q,w;
        while(i<T.length-1){
            if(T[i]==P[j]){
                    if(j==0){
                    return i;
                    }
                    else{
                --i;
                --j;
                        }
                   }  else{
               
         i=i+P.length -Math.min(j,1+Last(T[i],P));
           j=P.length-1;
            }
            
                            }      
           
        
        return -1;   
    }
    
    
   public static int Last(char L,char[] P){
       
       for(int a=P.length-1;a>0;--a){
           
           if(P[a]==L){ 
              
              return a;
                
            }
           
        }
        return -1;
   }
   
 }
