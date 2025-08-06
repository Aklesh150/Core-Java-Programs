public class MinimunValueArray {
    public static void main(String[] args) {
        int [] arr = {5, 8, 7, 3, 2, 9, 4, 6, 1};
        int min = arr[0];
        for(int i = 0; i< arr.length; i++){
            if(min>arr[i])
                min = arr[i];
        }
        System.out.print(min);
    }
}
