public class PeakElement {

    public int[] peakElement(int[] arr) {

            int[] result = new int[]{};

            if (arr.length != 0 || arr != null) {

                int countArray = 0;

                if (arr[0] > arr[1]) {
                    countArray++;
                }
                if (arr[arr.length - 1] > arr[arr.length - 2]) {
                    countArray++;
                }

                for (int i = 1; i < arr.length - 1; i++) {
                    if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                        countArray++;
                    }
                }

                System.out.println(countArray);

                result = new int[countArray];
                countArray = 0;
                if (arr[0] > arr[1]) {
                    result[0] = arr[0];
                    countArray++;
                }
                if (arr[arr.length - 1] > arr[arr.length - 2]) {
                    result[result.length - 1] = arr[arr.length - 1];
                }

                for (int i = 1; i < arr.length - 1; i++) {
                    if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                        result[countArray] = arr[i];
                        countArray++;
                    }
                }

            }
            return result;
        }
    }

