public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {3, 5, 4, 1, 2, 10, 1, -2};
        int n = array.length;
        for(int  i = 0;  i < n;  i++){
            boolean sorted = false;
            for(int j = i +1;  j < n;  j++){
                if(array[i] > array[j]){
                   int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    sorted = true;
                }

                }
            if(!sorted){
                break;
            }
        }
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
