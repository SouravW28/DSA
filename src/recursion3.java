import java.util.*;

public class recursion3 {
    public static void fib(int n,int a,int b){

        if(n==0){
            System.out.println("DONE");
            return;
        }
        int c=a+b;
        System.out.print(c+" ");
        fib(n-1,b,c);

    }

    public static void main(String[] args) {
        System.out.print(0+" ");
        System.out.print(1+" ");
        fib(6,0,1);
    }
}
