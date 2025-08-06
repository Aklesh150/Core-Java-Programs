public class SecondMaxArray {
    public static void main(String[] args) {
        int[] arr = {5, 8, 7, 3, 2, 9, 4, 6, 1};
        int firstHighest= arr[0];
        int secondHighest = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length; i++){
            if(firstHighest<arr[i]){
                secondHighest = firstHighest;
                firstHighest= arr[i];
            }
            else if(secondHighest<arr[i] && arr[i]<firstHighest){
                secondHighest = arr[i];
            }
        }
        System.out.print(secondHighest);

    }
}
