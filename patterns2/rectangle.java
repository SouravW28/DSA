
import java.util.*;

public class rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF COLUMNS :");
        int a=sc.nextInt();
        System.out.print("ENTER THE NUMBER OF ROWS :");
        int b=sc.nextInt();
        for(int j=1 ; j<=b ; j++){
            for(int i=0;i<a;i++){
                System.out.print("*"+" ");
            }
            System.out.println(" ");
            }
        sc.close();
        }
    }
    

