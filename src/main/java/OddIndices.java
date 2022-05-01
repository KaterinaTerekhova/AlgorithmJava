public class OddIndices {
    public static int[] oddIndicesAlgorithm(int[]arr) {

        int odd = 0;
        int even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                odd++;
            }else {
                even++;
            }
        }
        int[] oddMassive = new int[odd];

        odd = 0;
        for(int i = 0; i < arr.length; i ++) {
            // if (arr.length != 0) {
            if (arr[i] % 2 != 0) {
                oddMassive[odd] = arr[i];
                odd++;
            }
        }
        return oddMassive;

    }


}

