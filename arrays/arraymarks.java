import java.util.*;

public class arraymarks {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE SIZE OF ARRAY :");
        int size=sc.nextInt();

        int marks[]=new int[size];

        for(int i=0 ; i<size ; i++){
            System.out.print("ENTER YOUR MARKS :");
            marks[i]=sc.nextInt();
        }

        for(int j=0 ; j<size ; j++){
            if(j==0 ){
                System.out.print("[");
            }
            System.out.print(marks[j]+" ");
            if(j==size-1){
                System.out.print("]");
            }
        }
        sc.close();

    }
    
}
