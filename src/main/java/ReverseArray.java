public class ReverseArray {
    public static int[] reverseArrayAlgorithm(int[] arr, int n) {

        int[] arr2 = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            arr2[j - 1] = arr[i];
            j = j - 1;
        }
        return arr2;
    }
}
