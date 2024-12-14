package arrays;

public class waveArray {

    public static void waveArray(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // Step 2: Swap adjacent elements to create wave pattern
        for (int i = 0; i < array.length - 1; i += 2) {
            // Swap array[i] and array[i+1]
            int temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }
        // Step 3: Print the wave array
        for (int e : array) {
            System.out.print(e + " ");
        }
    }


    public static void main(String[] args) {
        int[] array = {1,5,4,9,8,2,7};
        waveArray(array);
    }
}
