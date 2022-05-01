public class OddIndicesAdditional {
    public static int[] oddIndicesAlgorithm1(int[] get) {

        int len = 0;
        for (int i = 0; i <= get.length; i++) {
            if (i % 2 != 0) {
                len++;
            }
        }
        int[] count = new int[len];
        int hhh = 0;
        for (int i = 0; i <= get.length; i++) {
            if (i % 2 != 0) {
                count[hhh] = get[i];
                hhh++;
            }
        }
        return count;
    }
}

