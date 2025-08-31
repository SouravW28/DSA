package JAVA;

import java.util.*;

public class rhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF ROWS :");
        int n=sc.nextInt();
        for(int i=0 ; i<=n ; i++){
            int space=(n-i);
            for(int j=0 ; j<=space ; j++){
                System.out.print(" ");
            }
            for(int j=0 ; j<=n ; j++){
                System.out.print("*");
            }
        System.out.println("");
        }
        sc.close();
    }
    
}
