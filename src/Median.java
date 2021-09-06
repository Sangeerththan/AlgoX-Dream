public class Median {

    //Get median of 2 sorted arrays
    public static void main(String[] args){
        int[] arr1 = { 1,2,3,44};
        int[] arr2 = { 4,3,44};
        int median = medianOfArrays(arr1, arr2);
        System.out.println("Median of the arrays is");
        System.out.println(median);

    }
    public static int medianOfArrays(int[] arr1, int [] arr2){
        int median;
        int n1 = arr1.length;
        int n2 = arr2.length;
        int n = n1+n2;
        int[] arr = new int[n];
        int[] arr3 = mergeArrays(arr1,arr2,n1,n2, arr);
        if ( n % 2 == 0 ) {
            median = arr3[n / 2];
        }
        else{
            median = (arr3[(n-1)/2]+arr3[(n+1)/2])/2;
        }
        return median;
    }


    public static int[] mergeArrays(int[] arr1, int[] arr2, int n1,
                                   int n2, int[] arr3)
    {
        int i = 0, j = 0, k = 0;

        while (i<n1 && j <n2)
        {
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }

        while (i < n1) {
            arr3[k++] = arr1[i++];
        }

        while (j < n2) {
            arr3[k++] = arr2[j++];
        }
        return arr3;
    }
}
