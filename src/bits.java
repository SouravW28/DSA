import java.util.*;

public class bits {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("WHAT DO YOU WANT TO UPDATE 0 OR 1?  :");
        int a= sc.nextInt();
        System.out.print("IN WHICH BIT DO YOU WANT TO ENTER?  :");
        int n = sc.nextInt();
        System.out.print("AT WHAT POSITION DO YOU WANT TO ENTER  :");
        int pos = sc.nextInt();

        if(a==0){
            int bitmask=1<<pos;
            int notbitmask=~(bitmask);
            int newnumber=notbitmask & n;
            System.out.println("NEW NUMBER  :"+newnumber);
        }

        if(a==1){
            int bitmask=1<<pos;
            int newnumber=bitmask | n;
            System.out.println("NEW NUMBER  :"+newnumber);
        }

    }
}
