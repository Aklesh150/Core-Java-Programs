public class MaximumValueArray {
    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 4, 3, 9, 5};
        int max = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.print(max);
    }
}

