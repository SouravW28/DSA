public class bubblesort {
    public static void main(String[] args) {
        int[] n={9,7,3,4};
        for(int j=0 ; j<3 ; j++){
            for(int i=0 ; i<3 ; i++){
                if (n[i]>n[i+1]){
                    int temp=n[i];
                    n[i]=n[i+1];
                    n[i+1]=temp;
                }

        }


        }

        for(int i=0 ;i<=3;i++){
            System.out.println(n[i]);
        }
    }


}
