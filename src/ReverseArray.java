public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 6, 2, 4};
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int i = 0;  i  < arr.length;  i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
      int[] new_array =   reverseArrayAfterM(3, arr);
        for(int i = 0;  i  < arr.length;  i++){
            System.out.print(new_array[i]+ " ");
        }
    }

    private static int[] reverseArrayAfterM(int i, int[] arr) {
        int start = i;
        int end = arr.length-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }


}
