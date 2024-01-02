// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class SelectionShort {
    public static void main(String[] args) {
        int[] array = {3, 5, 4, 1, 2, 10, 1, -2};
        int n = array.length;
        for(int  i = 0;  i < n-1;  i++){
            int min_index = i;
            for(int j = i +1;  j < n;  j++){
                if(array[min_index] > array[j])
                    min_index = j;

            }
            int  temp = array[i];
            array[i] = array[min_index];
            array[min_index] = temp;

        }
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
