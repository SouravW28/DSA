import java.util.*;

public class addfunction {
        public static int add(int a,int b){
        int c=a+b;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE 1ST NUMBER :");
        int a=sc.nextInt();

        System.out.print("ENTER THE 2ND NUMBER :");
        int b=sc.nextInt();

        int c=add(a,b);
        System.out.println("ADDITION OF NUMBER :"+c);
    }
}
