package static2.ex;

public class MathArrayUtils {
    public MathArrayUtils() {

    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    public static double average(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    public static int min(int[] arr) {
        int minValue = arr[0];
        for (int i : arr) {
            if (i < minValue) {
                minValue = i;
            }
        }
        return minValue;
    }

    public static int max(int[] arr) {
        int maxValue = arr[0];
        for (int i : arr) {
            if (i > maxValue) {
                maxValue = i;
            }
        }
        return maxValue;
    }
}
