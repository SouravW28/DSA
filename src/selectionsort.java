public class selectionsort {
    public static void main(String[] args) {
        int[] a = {5, 8, 7, 2, 1};

        for (int i = 0; i < a.length-1; i++) {
            int smallest = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[smallest] > a[j]) {
                    smallest = j;
                }
            }
            int temp = a[smallest];
            a[smallest] = a[i];
            a[i] = temp;

        }

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }


    }
}

