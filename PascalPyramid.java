import java.util.*;
public class PascalPyramid{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for(int i= 1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(j==1){
                    System.out.print(1+" ");
                }
                    
            }
            if(i>3){
                    System.out.print(i-1+" ");

                }
            if(i==n){
                System.out.print(" "+(n+1)+" ");
            }
            if(i>=3){
                    System.out.print(" " +(i-1));

                }
             
            if( i>=2){
                for(int j=3;j<=n;j++){
                if(j==n){
                    System.out.print(" "+1);
                }
                    
            } 
            }   

            System.out.println();
        }
        
        
    }
}