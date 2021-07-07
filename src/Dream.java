import java.util.Arrays;
import java.util.Scanner;

public class Dream {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of array: ");

        // Size of the array
        int size = scan.nextInt();
        int[] input = new int[size];

        // Closing Scanner
        scan.close();

        for(int val = 0; val < size; val++) {
            int random_int = (int)Math.floor(Math.random()*(size));
            input[val] = random_int;
        }
        BubbleSort.bubbleSort(input);
        System.out.println("Sorted Array:"+ Arrays.toString(input));
    }
}
