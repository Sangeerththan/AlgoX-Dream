public class BubbleSort {
    public static void bubbleSort(int[] inputArray) {
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < inputArray.length - 1; i++) {
                if (inputArray[i] > inputArray[i+1]) {
                    temp = inputArray[i];
                    inputArray[i] = inputArray[i+1];
                    inputArray[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }

}
