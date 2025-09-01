public class arr {
    public static void main(String[] args) {
        int[] arr={1,3,5,4,};
        int target=7;
        for(int i=0 ; i<arr.length ; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(i + " " + j);

                }
            }
        }
    }
}
