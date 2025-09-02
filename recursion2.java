import java.util.*;

public class recursion2 {

    public static void x(int n,int fac){
        if(n==1){
            fac=fac*n;
            System.out.println(fac);
            return;
        }
        fac=fac*n;
        x(n-1,fac);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF WHICH U WANT FACTORIAL  :");
        int g= sc.nextInt();
        x(g,1);
    }
}
