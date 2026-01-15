/*123456789
     1234567 
       12345  
         123   
           1   */

public class Main{
    public static void main(String x[]){
        for(int i = 1; i <= 5; i++){
            char n = 1;
            for(int j = 1; j <= 9; j++){
                if(j >=i && j <= 10-i){
                    System.out.print(n++);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


/*

ABCDEFGHI
 ABCDEFG 
  ABCDE  
    ABC   
      A    

public class Main{
    public static void main(String x[]){
        for(int i = 1; i <= 5; i++){
            char A = 65;
            for(int j = 1; j <= 9; j++){
                if(j >=i && j <= 10-i){
                    System.out.print(A++);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


abcdefghi
 abcdefg 
  abcde  
   abc   
    a    


public class Main{
    public static void main(String x[]){
        for(int i = 1; i <= 5; i++){
            char a = 97;
            for(int j = 1; j <= 9; j++){
                if(j >=i && j <= 10-i){
                    System.out.print(a++);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
*/