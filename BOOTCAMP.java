import java.util.*;
public class BOOTCAMP{
    public static void main(String args[]) {
        pattern1(5);
        System.out.println();
        pattern2(5);
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern6(5);
        System.out.println();
        pattern7(5);
        System.out.println();
        pattern8(5);
        System.out.println();
        pattern9(5);
        System.out.println();
        pattern10(5);
        System.out.println();
        pattern11(5);
        System.out.println();
        pattern12(5);
        System.out.println();
        pattern13(5);
        System.out.println();
        pattern14(5);
        System.out.println();
        pattern15(5);
        System.out.println();
        pattern16(5);
        System.out.println();
        pattern17(5);
        System.out.println();
        pattern18(5);
        System.out.println();
        pattern19(5);
        System.out.println();
        pattern20(5);
        System.out.println();
        pattern21(5);
        System.out.println();
        pattern22(5);
        System.out.println();
        pattern23(5);
        System.out.println();
        pattern24(5);
        System.out.println();
        pattern25(5);
        System.out.println();
        pattern26(6);
        System.out.println();
        pattern27(4);
        System.out.println();
        pattern28(5);
        System.out.println();
        pattern29(5);
        System.out.println();
        pattern30(5);
        System.out.println();
        pattern31(5);
        System.out.println();
        pattern32(5);
        System.out.println();
        pattern33('E');
        System.out.println();
        pattern34('E');
        System.out.println();
        pattern35('E');
        System.out.println();
        pattern36(9);
        System.out.println();
    }
    
    //PATTERN 1  SOLID_SQUARE
    static void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    //PATTERN 2  RIGHT ANGLED TRIANGLE
    static void pattern2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //PATTERN 3 INVERTED RIGHT ANGLED TRIANGLE
    static void pattern3(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    //PATTERN 4 RIGHT ANGLED NUMBER TRIANGLE
    static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    //PATTERN 5  HALF BUTTERFLY
    static void pattern5(int n){
        
        for(int i=1;i<=2*n;i++){
            int colno=(i<n)?i:(2*n-i);
            for(int j=1;j<=colno;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //PATTERN 6 2-180
    static void pattern6(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //PATTERN 7  3-180
    static void pattern7(int n){
        for(int i=n;i>=1;i--){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //PATTERN 8  STAR PYRAMID
    static void pattern8(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //PATTERN 9  INVERTED STAR PYRAMID
    static void pattern9(int n){
        for(int i=n;i>=1;i--){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=2*i-1;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //PATTERN 10  NEAT PYRAMID WITH 1 STAR 2 STAR.....
    static void pattern10(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    //PATTERN 11   10-180ROTATE
    static void pattern11(int n){
        for(int i=n;i>=1;i--){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    //PATTERN 12   HOURGLASS
    static void pattern12(int n){
        for(int i=1;i<2*n;i++){
            int spacen0=(i<=n)?i:2*n-i;
            for(int j=1;j<spacen0;j++){
                System.out.print("  ");
            }
            for(int j=(2*n)-(2*spacen0);j>=0;j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    
    //PATTERN 13  HOLLOW STAR PYRAMID
    static void pattern13(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                if((j==1)||i==n||j==2*i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
           
            
            System.out.println();
        }
    }
    //PATTERN 14    13 INVERT180
    static void pattern14(int n){
        for(int i=n;i>=1;i--){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=2*i-1;j>=1;j--){
                if((j==1)||i==n||j==2*i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
           
            
            System.out.println();
        }
    }
    //PATTERN 15  HOLLOW DIAMOND/KITE
    static void pattern15(int n){
        for(int i=1;i<=n;i++){
           
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j =1;j<=2*i-1;j++){
                if(j==1||j==2*i-1){
                    System.out.print("*");
                } 
                else{
                    System.out.print(" ");
                } 
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
           
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j =1;j<=2*i-1;j++){
                if(j==1||j==2*i-1){
                    System.out.print("*");
                } 
                else{
                    System.out.print(" ");
                } 
            }
            System.out.println();
        }
        
    }
    //PATTERN 16  PASCAL TRIANGLE
    static void pattern16(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            int x=1;
            for(int j=1;j<=i;j++){
                System.out.print(" "+ x +" ");
                x=x*(i-j)/j;
            }
            System.out.println();
        }
    }
    //PATTERN 17   NUMBER PALINDROME DIAMOND 1,212,32123
    static void pattern17(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    //PATTERN 18    DIAMOND CUT OUT FROM RECTANGLE
    static void pattern18(int n){
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("*");

            }
            for(int j=2*n-i;j>i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--){
                System.out.print("*");

            }
            for(int j=2*n-i;j>i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
        
       
    //PATTERN 19 BUTTERFLY
    static void pattern19(int n){
        for(int i=1;i<n;i++){
            for(int j=i;j>=1;j--){
                System.out.print("*");

            }
            for(int j=2*n-i;j>i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("*");

            }
            for(int j=2*n-i;j>i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
    //PATTERN 20  HOLLOW SQUARE
    static void pattern20(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    //PATTERN 21  FLOYD TRIANGLE
    static void pattern21(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    //PATTERN 22 RIGHT ANGLED BITS TRIANGLE 1,01,101
    static void pattern22(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1+" ");
                }
                else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }

    }
    //PATTERN 23 MEOW M

    static void pattern23(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j==1||j==2*i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=2*n-2*i;j>=1;j--){
                System.out.print(" ");
                 
            }
            
            for(int j=1;j<=2*i-1;j++){
                if(j==1||j==2*i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    //PATTERN 24  HOLLOW BUTTERFLY
    static  void pattern24(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==1||i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=1;j<=2*n-2*i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==1||j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                if(j==1||i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=1;j<=2*n-2*i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==1||j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    //PATTERN 25 hollow rhombus
    static void pattern25(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(j==1||i==1||j==n||i==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    //PATTERN 26
    static void pattern26(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(n-i+1);
            }
            System.out.println();
        }
    }
    //PATTERN 27 INVERTED TRIANGLE WITH FLOYD INVERT
    static void pattern27(int n){
        int num=1;
        int num1=n*(n+1);
        for(int i=n;i>=1;i--){
            for(int j=n-i;j>=1;j--){
                System.out.print("   ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(num+"  ");
                num++;
            }
            
            for(int j=i;j>=1;j--){
                System.out.print(num1+ "  ");
                num1--;
                
            }
            System.out.println();
        }
        
    }
    //PATTERN 28() DIAMOND
    static void pattern28(int n){
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");

            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");

            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //PATTERN 29 BUTTERFLY
    static void pattern29(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
                  
            }
            for(int j=2*n-2*i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
                  
            }
            for(int j=2*n-2*i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    //PATTERN 30' palindrome num pyramid
    static void pattern30(int n){
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            } 
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    //PATTERN 31  number square hardest
    static void pattern31(int n){
        int originalN=n;
        n=2*n;

        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                int x= Math.min(Math.min(i,j),Math.min(n-i,n-j));
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
    //PATTERN 32 --31 reverse
    static void pattern32(int n){
        int oN=n;
        n=2*n;

        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                int x= oN-Math.min(Math.min(i,j),Math.min(n-i,n-j));
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
    //PATTERN 33 alphabet triangle
    static void pattern33(char c){
        for(char j='Z';j>='A';j--){
            for(char k=j;k>='A';k--){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        
    }
    //PATTERN 34 invert33
    static void pattern34(char c){
        for(char j='Z';j>='A';j--){
            for(char k=j;k<='Z';k++){
                System.out.print(k+" ");
            }
            
            System.out.println();
        }
        
        
    }
    
    //PATTERN 35  ALPHABET TRIANGLE WITH SIMULTANEOUS UPPER N LOWER CASE
    static void pattern35(char c){
        char alph='A';
        for(char j='A';j<='E';j++){
            for(char k='A';k<=j;k++){
                if((j+k)%2==0){
                    System.out.print(Character.toLowerCase(alph)+" ");
                }
                else{
                   System.out.print(Character.toUpperCase(alph)+" ");
                }
                alph++;
            }   
            System.out.println();
        }  
    }

    // PATTERN 36---  BUTTERFLY OF NUMBERS
    static void pattern36(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1;j<=2*n-2*i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1;j<=2*n-2*i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }


    
}