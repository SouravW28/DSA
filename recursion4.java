public class recursion4 {
    public static int st(int x,int n){
        if(n==0){
            return 1;
        }
        int z=st(x,n-1);
        int w=x*z;
        return w;


    }

    public static void main(String[] args) {
        int f=st(6,2);
        System.out.println(f);
    }
}
