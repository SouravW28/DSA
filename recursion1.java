import java.util.*;

public class recursion1 {
        public static void x(int n,int b){
        if(n==0){
            b=b+n;
            System.out.println(b);
            return;
        }
        b=b+n;
        x(n-1,b);



    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER UPTO WHICH U HAVE TO ADD :");
        int a= sc.nextInt();
        x(a,0);



    }
}
