package Assignment;


import java.util.Arrays;




/**
 *
 * @author Abdullah
 */
public class Knuth_Morris_Pratt_Algorithm {
     
    public static void main(String[] args){ // Start Main Method
            char[] Array={'C','O','M','S','A','T','S'
            ,'I','S','L','A','M','A','B','A','D'
            };
            char[] P={'I','S','L','A','M'};
            int[] prefix=new int[P.length];

       if(KMPSearch(Array,P,prefix)!=-1){
            System.out.println("Match Found At Index="+KMPSearch(Array,P,prefix));
       }else{
            System.out.println("NO Match Found");
       }

    
    }//End Main Method
    //Knuth Morio Search Method
    public static int KMPSearch(char T[],char[] P,int[] Prefix){ //Start
                int i=0,j=0;
                int m=P.length;
                int n=T.length;
              prefixcheck(P,Prefix);
      while(i<n){
                if(T[i]==P[j]){
                        if(j==m-1){
                             return i-j;

                        }
                        else{
                            ++i;
                            ++j;
                        }
                }
          else if(j>0){
                j=Prefix[j-1];
           
          }
          else{
              ++i;             
          }
      }  
      return -1;  
    }
    //Prefix Function
    public static void prefixcheck(char Pattern[],int Prefix[]){ //Start prefix Function
                int i=1,j=0;
                int n=Pattern.length;
        while(i<n){
                        if(Pattern[i]==Pattern[j]){
                                Prefix[i]=j+1;
                                   ++i;
                                   ++j;
                            }
                    else if(j>0){
                                j=Prefix[j-1];

                    }
                    else {

                          Prefix[i]=0;
                          ++i; 
                    }   
        }
    }//End Prefix MEthod
    
    
    
}//End Class
