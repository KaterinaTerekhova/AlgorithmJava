public class MinMaxAve {
    public static double[] minMaxAveAlgorithm(int[] numbers, int min, int max) {
        if (numbers.length > 0 && min <= max && min >= 0) {

            int minimumNumber = numbers[min];
            int maximumNumber = numbers[min];
            int sum = 0;
            int count = 0;

            for (int i = min; i <= max; i++) {
                if (minimumNumber > numbers[i]) {
                    minimumNumber = numbers[i];
                }
            }

            for (int i = min; i <= max; i++) {
                if (maximumNumber < numbers[i]) {
                    maximumNumber = numbers[i];
                }
            }

            for (int i = min; i <= max; i++) {
                sum += numbers[i];
                count++;
            }

            double average = (double) sum / count;
            //System.out.format("%.1f", average);
            double[] result = {minimumNumber, maximumNumber, average};

            return result;
        }

        return new double[]{};
    }
}
