public class SumArray {

    public static int sumArrayAlgorithm(int[] get) {
        int sum = 0;
        for (int i = 0; i < get.length; i++) {
            sum += get[i];
        }
        return sum;
    }
}
