import java.util.*;
public class recursion {
    public static void a(int n,int m){
        if(n>m){
            return;
        }
        System.out.print(n+" ");
        a(n+1,m);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER FROM WHERE U HAVE TO START :");
        int b= sc.nextInt();
        System.out.print("ENTER THE NUMBER UPTO WHERE U HAVE TO END  :");
        int c=sc.nextInt();
         a(b,c);
    }
}
