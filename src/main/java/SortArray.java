public class SortArray {

    public static int[] sortArrayAlgorithm(int[] arrNow) {
        int[] arr3 = new int[arrNow.length];
        for (int i = 0; i < arrNow.length; i++) {
            Arrays.sort(arrNow);
            arr3[i] = arrNow[i];
        }
        return arr3;
    }

}
